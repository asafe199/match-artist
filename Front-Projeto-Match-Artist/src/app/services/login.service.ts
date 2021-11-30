import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { HttpUtilService } from './http-util.service';
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class LoginService extends HttpUtilService{

  constructor(http: HttpClient) {
    super(http, 'login');
}
login(email: string, password: string) : Observable<any>{
  const login = {"email": email, "password": password};
  return this.http.post<any>(`${this.url}`, login);
}
}