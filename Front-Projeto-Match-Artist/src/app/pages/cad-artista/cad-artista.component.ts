import { Component, OnInit } from "@angular/core";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {UsuarioService} from "../../services/usuario.service";
import {Router} from "@angular/router";

@Component({
    selector: "app-cad-artista",
    templateUrl: "./cad-artista.component.html",
    styleUrls: ["./cad-artista.component.css"],
})
export class CadArtistaComponent implements OnInit {

    formulario: FormGroup;
    tipoUsuario = [
        {"id": 1, "desc": "Artista"},
        {"id": 2, "desc": "Estabelecimento"},
    ];
    enableButton: boolean = false;
    tipo: any;

    constructor(private fb: FormBuilder,
                private usuarioService : UsuarioService,
                private router : Router,
    ) {

    }

    ngOnInit(): void {
        this.initForm();
    }

    initForm(){
        this.formulario = this.fb.group({
            senha: [null, [Validators.required]],
            email: [null, [Validators.required, Validators.email]],
            tipoUsuario : [null, [Validators.required]],
            nomeArtista : [null],
            descArtista : [null],
            contatoArtista : [null],
            contatoEstab : [null],
            nomeEstab : [null],
            descEstab : [null],
        });
    }

    enviar() {
        if(this.formulario.valid){
            let usuario = {
                "usuario" : {
                    "email": this.formulario.controls.email.value,
                    "password": this.formulario.controls.senha.value,
                    "tipoUsuario" : {
                        "id": this.tipo.id
                    }
                },
                "estabelecimento" : {
                    "nomeEstabelecimento" : this.formulario.controls.nomeEstab.value,
                    "contato" : this.formulario.controls.contatoEstab.value,
                    "descricao" : this.formulario.controls.descEstab.value,
                },
                "artista" : {
                    "nomeArtista": this.formulario.controls.nomeArtista.value,
                    "descricao" :  this.formulario.controls.descArtista.value,
                    "contato": this.formulario.controls.contatoArtista.value,
                }
            };
            this.usuarioService.add(usuario).subscribe(res => {
                console.log(res);
                this.router.navigate(["/main"]);
            }, err => {
                console.log(err);
            })
        }
    }

    disableButton(){
        this.enableButton = this.tipo !== undefined ? this.tipo.id == 1 : false;
        // if(!this.enableButton){
        //     this.formulario.controls.nomeEstab = null;
        //     this.formulario.controls.contatoEstab = null;
        //     this.formulario.controls.descEstab = null;
        // } else {
        //     this.formulario.controls.nomeArtista = null;
        //     this.formulario.controls.descArtista = null;
        //     this.formulario.controls.contatoArtista = null;
        // }
    }
}
