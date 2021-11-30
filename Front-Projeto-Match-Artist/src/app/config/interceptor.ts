import {HttpEvent, HttpHandler, HttpInterceptor, HttpRequest} from "@angular/common/http";
import {Observable} from "rxjs";
import {Injectable} from "@angular/core";

@Injectable()
export class InterceptorReq implements HttpInterceptor {
    intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
        console.error(req.url);
        if(!((req.url.endsWith('/login') || req.url.endsWith('/usuario')) && req.method == 'POST')){
            req.headers.set("Authorization", localStorage.getItem('JWT'))
        }
        return next.handle(req);
    }
}
