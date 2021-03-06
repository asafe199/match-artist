import { Component, OnInit } from "@angular/core";

@Component({
    selector: "app-menu",
    template: `
        <div class="menu-scroll-content">
            <ul class="navigation-menu">
                <li
                    app-menuitem
                    *ngFor="let item of model; let i = index"
                    [item]="item"
                    [index]="i"
                    [root]="true"
                ></li>
            </ul>
        </div>
    `,
})
export class AppMenuComponent implements OnInit {
    public model: any[];

    ngOnInit() {
        this.model = [
            { label: "Dashboard", icon: "pi pi-fw pi-home", routerLink: ["/"] },
            {
                label: "Telas Artista",
                icon: "pi pi-fw pi-star-o",
                routerLink: ["/uikit"],
                items: [
                    {
                        label: "Estabelecimentos Favoritos",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["/uikit/ListarEstabelecimentosFavoritos"],
                    },
                    {
                        label: "Estabelecimentos",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["uikit/ListarEstabelecimentos"],
                    },
                    {
                        label: "Login",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["/login"],
                    },
                    {
                        label: "Tipo Usuário",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["/tipousuario"],
                    },
                    {
                        label: "Cadastro Artista",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["/cadArtista"],
                    },
                    {
                        label: "EsqueciMinhaSenha",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["/EsqueciMinhaSenha"],
                    },
                    {
                        label: "EsqueciMinhaSenha2",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["/EsqueciMinhaSenha2"],
                    },
                    {
                        label: "Solicitar do Artista para o Evento",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["uikit/SolicitarEvento"],
                    },
                    {
                        label: "Perfil Estabelecimento",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["uikit/PerfilEstabelecimento"],
                    },
                    {
                        label: "Eventos Disponiveis de Algum Estabelecimento",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: [
                            "uikit/EventosDisponiveisDoEstabelecimento",
                        ],
                    },
                    {
                        label: "Solicitações Pendentes",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["/uikit/SolicitacoesPendentes"],
                    },
                    {
                        label: "Eventos Confirmados",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["/uikit/EventosConfirmados"],
                    },
                    {
                        label: "Form Layout",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["/uikit/formlayout"],
                    },
                    {
                        label: "Input",
                        icon: "pi pi-fw pi-check-square",
                        routerLink: ["/uikit/input"],
                    },
                    {
                        label: "Float Label",
                        icon: "pi pi-bookmark",
                        routerLink: ["/uikit/floatlabel"],
                    },
                    {
                        label: "Invalid State",
                        icon: "pi pi-exclamation-circle",
                        routerLink: ["/uikit/invalidstate"],
                    },
                    {
                        label: "Button",
                        icon: "pi pi-fw pi-mobile",
                        routerLink: ["/uikit/button"],
                        class: "rotated-icon",
                    },
                    {
                        label: "Table",
                        icon: "pi pi-fw pi-table",
                        routerLink: ["/uikit/table"],
                    },
                    {
                        label: "List",
                        icon: "pi pi-fw pi-list",
                        routerLink: ["/uikit/list"],
                    },
                    {
                        label: "Tree",
                        icon: "pi pi-fw pi-share-alt",
                        routerLink: ["/uikit/tree"],
                    },
                    {
                        label: "Panel",
                        icon: "pi pi-fw pi-tablet",
                        routerLink: ["/uikit/panel"],
                    },
                    {
                        label: "Overlay",
                        icon: "pi pi-fw pi-clone",
                        routerLink: ["/uikit/overlay"],
                    },
                    {
                        label: "Media",
                        icon: "pi pi-fw pi-image",
                        routerLink: ["/uikit/media"],
                    },
                    {
                        label: "Menu",
                        icon: "pi pi-fw pi-bars",
                        routerLink: ["/uikit/menu"],
                    },
                    {
                        label: "Message",
                        icon: "pi pi-fw pi-comment",
                        routerLink: ["/uikit/message"],
                    },
                    {
                        label: "File",
                        icon: "pi pi-fw pi-file",
                        routerLink: ["/uikit/file"],
                    },
                    {
                        label: "Chart",
                        icon: "pi pi-fw pi-chart-bar",
                        routerLink: ["/uikit/charts"],
                    },
                    {
                        label: "Misc",
                        icon: "pi pi-fw pi-circle-off",
                        routerLink: ["/uikit/misc"],
                    },
                ],
            },
            {
                label: "Telas Estabelecimento",
                icon: "pi pi-fw pi-star-o",
                routerLink: ["/uikit"],
                items: [
                    {
                        label: "Perfil Artista",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["/uikit/PerfilArtista"],
                    },
                    {
                        label: "Cadastro Estabelecimento",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["cadEstabelecimento"],
                    },
                    {
                        label: "Eventos Confirmados",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: [
                            "/uikit/EventosConfirmadosTelaEstabelecimento",
                        ],
                    },
                    {
                        label: "Meus Eventos",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["/uikit/MeusEventosdeEstabelecimento"],
                    },
                    {
                        label: "Criar Novo Evento",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["/uikit/CriarNovoEvento"],
                    },
                    {
                        label: "Listar Artistas",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["uikit/ListarArtistas"],
                    },
                    {
                        label: "Proposta do Artista Para o Estabelecimento",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: [
                            "uikit/PropostaDoArtistaParaOEstabelecimento",
                        ],
                    },
                    {
                        label: "Listar Artistas Favoritos",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["uikit/ListarArtistasFavoritos"],
                    },
                ],
            },

            {
                label: "Utilities",
                icon: "pi pi-fw pi-compass",
                routerLink: ["utilities"],
                items: [
                    {
                        label: "Pagina",
                        icon: "pi pi-fw pi-id-card",
                        routerLink: ["pages/perfil-artista"],
                    },
                ],
            },
            {
                label: "Pages",
                icon: "pi pi-fw pi-briefcase",
                routerLink: ["/pages"],
                badgeStyleClass: "teal-badge",
                items: [
                    {
                        label: "Display",
                        icon: "pi pi-fw pi-desktop",
                        routerLink: ["utilities/display"],
                    },
                    {
                        label: "Elevation",
                        icon: "pi pi-fw pi-external-link",
                        routerLink: ["utilities/elevation"],
                    },
                    {
                        label: "FlexBox",
                        icon: "pi pi-fw pi-directions",
                        routerLink: ["utilities/flexbox"],
                    },
                    {
                        label: "Icons",
                        icon: "pi pi-fw pi-search",
                        routerLink: ["utilities/icons"],
                    },
                    {
                        label: "Text",
                        icon: "pi pi-fw pi-pencil",
                        routerLink: ["utilities/text"],
                    },
                    {
                        label: "Widgets",
                        icon: "pi pi-fw pi-star-o",
                        routerLink: ["utilities/widgets"],
                    },
                    {
                        label: "Grid System",
                        icon: "pi pi-fw pi-th-large",
                        routerLink: ["utilities/grid"],
                    },
                    {
                        label: "Spacing",
                        icon: "pi pi-fw pi-arrow-right",
                        routerLink: ["utilities/spacing"],
                    },
                    {
                        label: "Typography",
                        icon: "pi pi-fw pi-align-center",
                        routerLink: ["utilities/typography"],
                    },
                ],
            },
            {
                label: "Pages",
                icon: "pi pi-fw pi-briefcase",
                routerLink: ["/pages"],
                badge: 8,
                badgeStyleClass: "teal-badge",
                items: [
                    {
                        label: "Crud",
                        icon: "pi pi-fw pi-pencil",
                        routerLink: ["/pages/crud"],
                    },
                    {
                        label: "Calendar",
                        icon: "pi pi-fw pi-calendar-plus",
                        routerLink: ["/pages/calendar"],
                    },
                    {
                        label: "Timeline",
                        icon: "pi pi-fw pi-calendar",
                        routerLink: ["/pages/timeline"],
                    },
                    {
                        label: "Landing",
                        icon: "pi pi-fw pi-globe",
                        url: "assets/pages/landing.html",
                        target: "_blank",
                    },
                    {
                        label: "Login",
                        icon: "pi pi-fw pi-sign-in",
                        routerLink: ["/login"],
                    },
                    {
                        label: "Invoice",
                        icon: "pi pi-fw pi-dollar",
                        routerLink: ["/pages/invoice"],
                    },
                    {
                        label: "Help",
                        icon: "pi pi-fw pi-question-circle",
                        routerLink: ["/pages/help"],
                    },
                    {
                        label: "Error",
                        icon: "pi pi-fw pi-times-circle",
                        routerLink: ["/error"],
                    },
                    {
                        label: "Not Found",
                        icon: "pi pi-fw pi-exclamation-circle",
                        routerLink: ["/notfound"],
                    },
                    {
                        label: "Access Denied",
                        icon: "pi pi-fw pi-lock",
                        routerLink: ["/access"],
                    },
                    {
                        label: "Empty",
                        icon: "pi pi-fw pi-circle-off",
                        routerLink: ["/pages/empty"],
                    },
                ],
            },
            {
                label: "Hierarchy",
                icon: "pi pi-fw pi-align-left",
                items: [
                    {
                        label: "Submenu 1",
                        icon: "pi pi-fw pi-align-left",
                        items: [
                            {
                                label: "Submenu 1.1",
                                icon: "pi pi-fw pi-align-left",
                                items: [
                                    {
                                        label: "Submenu 1.1.1",
                                        icon: "pi pi-fw pi-align-left",
                                    },
                                    {
                                        label: "Submenu 1.1.2",
                                        icon: "pi pi-fw pi-align-left",
                                    },
                                    {
                                        label: "Submenu 1.1.3",
                                        icon: "pi pi-fw pi-align-left",
                                    },
                                ],
                            },
                            {
                                label: "Submenu 1.2",
                                icon: "pi pi-fw pi-align-left",
                                items: [
                                    {
                                        label: "Submenu 1.2.1",
                                        icon: "pi pi-fw pi-align-left",
                                    },
                                ],
                            },
                        ],
                    },
                    {
                        label: "Submenu 2",
                        icon: "pi pi-fw pi-align-left",
                        items: [
                            {
                                label: "Submenu 2.1",
                                icon: "pi pi-fw pi-align-left",
                                items: [
                                    {
                                        label: "Submenu 2.1.1",
                                        icon: "pi pi-fw pi-align-left",
                                    },
                                    {
                                        label: "Submenu 2.1.2",
                                        icon: "pi pi-fw pi-align-left",
                                    },
                                ],
                            },
                            {
                                label: "Submenu 2.2",
                                icon: "pi pi-fw pi-align-left",
                                items: [
                                    {
                                        label: "Submenu 2.2.1",
                                        icon: "pi pi-fw pi-align-left",
                                    },
                                ],
                            },
                        ],
                    },
                ],
            }
            
        ];
    }
}
