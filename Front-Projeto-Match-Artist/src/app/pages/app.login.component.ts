import {Component, OnInit} from "@angular/core";
import {UsuarioService} from "../services/usuario.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import { Router } from "@angular/router";
import { LoginService } from "../services/login.service";

@Component({
    selector: "app-login",
    templateUrl: "./app.login.component.html",
})
export class AppLoginComponent implements OnInit{
    formulario: FormGroup;

    constructor(
        private usuarioService: LoginService,
        private fb: FormBuilder,
        private router: Router
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
                        this.router.navigate(['/']);
                    },
                        error => {
                            

                    })
        }
    }

}
