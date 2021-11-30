import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {HttpUtilService} from "./http-util.service";

@Injectable({
  providedIn: 'root'
})
export class UsuarioService extends HttpUtilService{

    constructor(http: HttpClient) {
        super(http, 'usuario');
    }

    login(email: string, password: string) : Observable<any>{
        const login = {"email": email, "password": password};
        return this.http.post<any>(`${this.url}`, login);
    }
}
