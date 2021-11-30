import {Component, OnInit} from "@angular/core";
import {UsuarioService} from "../services/usuario.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
    selector: "app-login",
    templateUrl: "./app.login.component.html",
})
export class AppLoginComponent implements OnInit{
    formulario: FormGroup;

    constructor(
        private usuarioService: UsuarioService,
        private fb: FormBuilder,
    ) {

    }

    ngOnInit(): void {
        this.formulario = this.fb.group({
            email: [null, [Validators.required, Validators.email]],
            password: [null, [Validators.required]],
        });
    }

    login(){
        if(this.formulario.valid){
            this.usuarioService.login(this.formulario.controls?.email?.value, this.formulario.controls?.password?.value)
                .subscribe(res => {
                        localStorage.setItem('JWT', res.headers.get('Authorization'));
                        console.log(res.headers.get('Authorization'));
                    },
                        error => {
                    })
        }
    }

}
