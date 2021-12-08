import { RouterModule } from "@angular/router";
import { NgModule } from "@angular/core";
import { AppMainComponent } from "./app.main.component";
import { AppNotfoundComponent } from "./pages/app.notfound.component";
import { AppErrorComponent } from "./pages/app.error.component";
import { AppAccessdeniedComponent } from "./pages/app.accessdenied.component";
import { AppLoginComponent } from "./pages/app.login.component";
import { TipousuarioComponent } from "./pages/tipousuario/tipousuario.component";
import { CadArtistaComponent } from "./pages/cad-artista/cad-artista.component";
import { RecuperarSenhaComponent } from "./pages/recuperar-senha/recuperar-senha.component";
import { RecuperarSenha2Component } from "./pages/recuperar-senha2/recuperar-senha2.component";
import { CadEstabelecimentoComponent } from "./pages/cad-estabelecimento/cad-estabelecimento.component";


@NgModule({
    imports: [
        RouterModule.forRoot(
            [
                { path: "", redirectTo: "/login", pathMatch: 'full' },
                { path: "login", component: AppLoginComponent },
                { path: "main", component: AppMainComponent },
                { path: "error", component: AppErrorComponent },
                { path: "access", component: AppAccessdeniedComponent },
                { path: "notfound", component: AppNotfoundComponent },
                { path: "tipousuario", component: TipousuarioComponent },
                { path: "cadArtista", component: CadArtistaComponent },
                {
                    path: "cadEstabelecimento",
                    component: CadEstabelecimentoComponent,
                },
                {
                    path: "EsqueciMinhaSenha",
                    component: RecuperarSenhaComponent,
                },
                {
                    path: "EsqueciMinhaSenha2",
                    component: RecuperarSenha2Component,
                },
                { path: "**", redirectTo: "/notfound" },
            ],
            { scrollPositionRestoration: "enabled" }
        ),
    ],
    exports: [RouterModule],
})
export class AppRoutingModule {}
