import { RouterModule } from "@angular/router";
import { NgModule } from "@angular/core";
import { DashboardDemoComponent } from "./demo/view/dashboarddemo.component";
import { FormLayoutDemoComponent } from "./demo/view/formlayoutdemo.component";
import { FloatLabelDemoComponent } from "./demo/view/floatlabeldemo.component";
import { InvalidStateDemoComponent } from "./demo/view/invalidstatedemo.component";
import { PanelsDemoComponent } from "./demo/view/panelsdemo.component";
import { OverlaysDemoComponent } from "./demo/view/overlaysdemo.component";
import { MediaDemoComponent } from "./demo/view/mediademo.component";
import { MenusDemoComponent } from "./demo/view/menusdemo.component";
import { MessagesDemoComponent } from "./demo/view/messagesdemo.component";
import { MiscDemoComponent } from "./demo/view/miscdemo.component";
import { EmptyDemoComponent } from "./demo/view/emptydemo.component";
import { ChartsDemoComponent } from "./demo/view/chartsdemo.component";
import { FileDemoComponent } from "./demo/view/filedemo.component";
import { DocumentationComponent } from "./demo/view/documentation.component";
import { AppMainComponent } from "./app.main.component";
import { AppNotfoundComponent } from "./pages/app.notfound.component";
import { AppErrorComponent } from "./pages/app.error.component";
import { AppAccessdeniedComponent } from "./pages/app.accessdenied.component";
import { AppLoginComponent } from "./pages/app.login.component";
import { InputDemoComponent } from "./demo/view/inputdemo.component";
import { ButtonDemoComponent } from "./demo/view/buttondemo.component";
import { TableDemoComponent } from "./demo/view/tabledemo.component";
import { ListDemoComponent } from "./demo/view/listdemo.component";
import { TreeDemoComponent } from "./demo/view/treedemo.component";
import { DisplayComponent } from "./utilities/display.component";
import { ElevationComponent } from "./utilities/elevation.component";
import { FlexboxComponent } from "./utilities/flexbox.component";
import { GridComponent } from "./utilities/grid.component";
import { IconsComponent } from "./utilities/icons.component";
import { WidgetsComponent } from "./utilities/widgets.component";
import { SpacingComponent } from "./utilities/spacing.component";
import { TypographyComponent } from "./utilities/typography.component";
import { TextComponent } from "./utilities/text.component";
import { AppCrudComponent } from "./pages/app.crud.component";
import { AppCalendarComponent } from "./pages/app.calendar.component";
import { AppTimelineDemoComponent } from "./pages/app.timelinedemo.component";
import { AppInvoiceComponent } from "./pages/app.invoice.component";
import { AppHelpComponent } from "./pages/app.help.component";
import { TipousuarioComponent } from "./pages/tipousuario/tipousuario.component";
import { CadArtistaComponent } from "./pages/cad-artista/cad-artista.component";
import { RecuperarSenhaComponent } from "./pages/recuperar-senha/recuperar-senha.component";
import { RecuperarSenha2Component } from "./pages/recuperar-senha2/recuperar-senha2.component";
import { ListarEstabelecimentosFavoritosComponent } from "./pages/listar-estabelecimentos-favoritos/listar-estabelecimentos-favoritos.component";
import { ListarEstabelecimentosComponent } from "./pages/listar-estabelecimentos/listar-estabelecimentos.component";
import { SolicitacaoDoArtistaParaEventoComponent } from "./pages/solicitacao-do-artista-para-evento/solicitacao-do-artista-para-evento.component";
import { PerfilEstabelecimentoComponent } from "./pages/perfil-estabelecimento/perfil-estabelecimento.component";
import { EventosDoEstabelecimentoParaArtistaComponent } from "./pages/eventos-do-estabelecimento-para-artista/eventos-do-estabelecimento-para-artista.component";
import { PerfilArtistaComponent } from "./pages/perfil-artista/perfil-artista.component";
import { CadEstabelecimentoComponent } from "./pages/cad-estabelecimento/cad-estabelecimento.component";
import { EventosEstabelecimentoComponent } from "./pages/eventos-estabelecimento/eventos-estabelecimento.component";
import { EventosConfirmadosComponent } from "./pages/eventos-confirmados/eventos-confirmados.component";
import { EstabelecimentosConfirmadosComponent } from "./pages/estabelecimentos-confirmados/estabelecimentos-confirmados.component";
import { MeusEventosDeEstabelecimentoComponent } from "./pages/meus-eventos-de-estabelecimento/meus-eventos-de-estabelecimento.component";
import { CriarNovoEventoComponent } from "./pages/criar-novo-evento/criar-novo-evento.component";
@NgModule({
    imports: [
        RouterModule.forRoot(
            [
                {
                    path: "",
                    component: AppMainComponent,
                    children: [
                        { path: "", component: DashboardDemoComponent },
                        {
                            path: "uikit/ListarEstabelecimentosFavoritos",
                            component: ListarEstabelecimentosFavoritosComponent,
                        },
                        {
                            path: "uikit/ListarEstabelecimentos",
                            component: ListarEstabelecimentosComponent,
                        },
                        {
                            path: "uikit/SolicitarEvento",
                            component: SolicitacaoDoArtistaParaEventoComponent,
                        },
                        {
                            path: "uikit/PerfilEstabelecimento",
                            component: PerfilEstabelecimentoComponent,
                        },
                        {
                            path: "uikit/EventosDisponiveisDoEstabelecimento",
                            component: EventosDoEstabelecimentoParaArtistaComponent,
                        },
                        {
                            path: "uikit/PerfilArtista",
                            component: PerfilArtistaComponent,
                        },
                        {
                            path: "uikit/SolicitacoesPendentes",
                            component: EventosEstabelecimentoComponent,
                        },
                        {
                            path: "uikit/EventosConfirmados",
                            component: EventosConfirmadosComponent,
                        },
                        {
                            path: "uikit/EventosConfirmadosTelaEstabelecimento",
                            component: EstabelecimentosConfirmadosComponent,
                        },
                        {
                            path: "uikit/MeusEventosdeEstabelecimento",
                            component: MeusEventosDeEstabelecimentoComponent,
                        },
                        {
                            path: "uikit/CriarNovoEvento",
                            component: CriarNovoEventoComponent,
                        },
                        
                        {
                            path: "uikit/formlayout",
                            component: FormLayoutDemoComponent,
                        },
                        {
                            path: "uikit/floatlabel",
                            component: FloatLabelDemoComponent,
                        },
                        {
                            path: "uikit/invalidstate",
                            component: InvalidStateDemoComponent,
                        },
                        { path: "uikit/input", component: InputDemoComponent },
                        {
                            path: "uikit/button",
                            component: ButtonDemoComponent,
                        },
                        { path: "uikit/table", component: TableDemoComponent },
                        { path: "uikit/list", component: ListDemoComponent },
                        { path: "uikit/tree", component: TreeDemoComponent },
                        { path: "uikit/panel", component: PanelsDemoComponent },
                        {
                            path: "uikit/overlay",
                            component: OverlaysDemoComponent,
                        },
                        { path: "uikit/media", component: MediaDemoComponent },
                        { path: "uikit/menu", component: MenusDemoComponent },
                        {
                            path: "uikit/message",
                            component: MessagesDemoComponent,
                        },
                        { path: "uikit/misc", component: MiscDemoComponent },
                        {
                            path: "uikit/charts",
                            component: ChartsDemoComponent,
                        },
                        { path: "uikit/file", component: FileDemoComponent },
                        {
                            path: "utilities/display",
                            component: DisplayComponent,
                        },
                        {
                            path: "utilities/elevation",
                            component: ElevationComponent,
                        },
                        {
                            path: "utilities/flexbox",
                            component: FlexboxComponent,
                        },
                        { path: "utilities/grid", component: GridComponent },
                        { path: "utilities/icons", component: IconsComponent },
                        {
                            path: "utilities/widgets",
                            component: WidgetsComponent,
                        },
                        {
                            path: "utilities/spacing",
                            component: SpacingComponent,
                        },
                        {
                            path: "utilities/typography",
                            component: TypographyComponent,
                        },
                        { path: "utilities/text", component: TextComponent },
                        { path: "pages/crud", component: AppCrudComponent },
                        {
                            path: "pages/calendar",
                            component: AppCalendarComponent,
                        },
                        {
                            path: "pages/timeline",
                            component: AppTimelineDemoComponent,
                        },
                        {
                            path: "pages/invoice",
                            component: AppInvoiceComponent,
                        },
                        { path: "pages/help", component: AppHelpComponent },
                        { path: "pages/empty", component: EmptyDemoComponent },
                        {
                            path: "pages/perfil-artista",
                            component: PerfilArtistaComponent,
                        },
                        {
                            path: "documentation",
                            component: DocumentationComponent,
                        },
                    ],
                },
                { path: "error", component: AppErrorComponent },
                { path: "access", component: AppAccessdeniedComponent },
                { path: "notfound", component: AppNotfoundComponent },
                { path: "login", component: AppLoginComponent },
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
