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
    tipo: any;

    tipoUsuario = [
        {"id": 1, "desc": "Artista"},
        {"id": 2, "desc": "Estabelecimento"},
    ];
    constructor(private fb: FormBuilder,
                private usuarioService : UsuarioService,
                private router : Router
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
            nomeArtista : [null, [Validators.required]],
            desc : [null, [Validators.required]],
            contato : [null, [Validators.required]],
        });
    }

    enviar() {
        if(this.formulario.valid){
            let usuario = {"email": this.formulario.controls.email.value, "password": this.formulario.controls.senha.value, "tipoUsuario" : {"id": this.tipo.id}};
            this.usuarioService.add(usuario).subscribe(res => {
                this.router.navigate(["/main"]);
            }, err => {
                console.error(err);
            })
        }
    }
}
