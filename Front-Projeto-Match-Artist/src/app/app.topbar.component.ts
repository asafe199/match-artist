import { Component } from "@angular/core";
import { AppMainComponent } from "./app.main.component";

@Component({
    selector: "app-topbar",
    template: `
        <div class="topbar clearfix">
            <div class="logo">
                <a href="#">
                    <img src="assets/layout/images/logo.png" />
                </a>
            </div>

            <a
                id="topbar-menu-button"
                href="#"
                (click)="appMain.onTopbarMenuButtonClick($event)"
            >
                <i class="pi pi-bars"></i>
            </a>

            <ul
                class="topbar-menu fadeInDown"
                [ngClass]="{ 'topbar-menu-visible': appMain.topbarMenuActive }"
            >
                <li
                    #profile
                    class="profile-item"
                    [ngClass]="{
                        'active-topmenuitem':
                            appMain.activeTopbarItem === profile
                    }"
                >
                    <a
                        href="#"
                        (click)="appMain.onTopbarItemClick($event, profile)"
                    >
                        <div class="profile-image">
                            <img src="assets/layout/images/profile-image.png" />
                        </div>
                        <div class="profile-info">
                            <span class="topbar-item-name profile-name">Artista</span>
                            
                        </div>
                    </a>

                    <ul class="fadeInDown">
                        <li role="menuitem">
                            <a
                                href="#"
                                (click)="appMain.onTopbarSubItemClick($event)"
                            >
                                <i class="pi pi-user"></i>
                                <span>Perfil</span>
                                <span class="topbar-submenuitem-badge">5</span>
                            </a>
                        </li>
                        <li role="menuitem">
                            <a
                                href="#"
                                (click)="appMain.onTopbarSubItemClick($event)"
                            >
                                <i class="pi pi-lock"></i>
                                <span>Privacidade</span>
                                <span class="topbar-submenuitem-badge">2</span>
                            </a>
                        </li>
                        <li role="menuitem">
                            <a
                                href="#"
                                (click)="appMain.onTopbarSubItemClick($event)"
                            >
                                <i class="pi pi-cog"></i>
                                <span>Configurações</span>
                            </a>
                        </li>
                        <li role="menuitem">
                            <a
                                href="#"
                                (click)="appMain.onTopbarSubItemClick($event)"
                            >
                                <i class="pi pi-sign-out"></i>
                                <span>Sair</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li
                    #settings
                    [ngClass]="{
                        'active-topmenuitem':
                            appMain.activeTopbarItem === settings
                    }"
                >
                    <a
                        href="#"
                        (click)="appMain.onTopbarItemClick($event, settings)"
                    >
                        <i class="topbar-icon pi pi-cog"></i>
                        <span class="topbar-item-name">Settings</span>
                    </a>
                    <ul class="fadeInDown">
                        <li role="menuitem">
                            <a
                                href="#"
                                (click)="appMain.onTopbarSubItemClick($event)"
                            >
                                <i class="pi pi-palette"></i>
                                <span>Change Theme</span>
                            </a>
                        </li>
                        <li role="menuitem">
                            <a
                                href="#"
                                (click)="appMain.onTopbarSubItemClick($event)"
                            >
                                <i class="pi pi-heart"></i>
                                <span>Favorites</span>
                            </a>
                        </li>
                        <li role="menuitem">
                            <a
                                href="#"
                                (click)="appMain.onTopbarSubItemClick($event)"
                            >
                                <i class="pi pi-lock"></i>
                                <span>Lock Screen</span>
                            </a>
                        </li>
                        <li role="menuitem">
                            <a
                                href="#"
                                (click)="appMain.onTopbarSubItemClick($event)"
                            >
                                <i class="pi pi-image"></i>
                                <span>Wallpaper</span>
                            </a>
                        </li>
                    </ul>
                </li>

                <li
                    #notifications
                    [ngClass]="{
                        'active-topmenuitem':
                            appMain.activeTopbarItem === notifications
                    }"
                >
                    <a href="/#/uikit/ListarEstabelecimentosFavoritos">
                        <i class="topbar-icon pi pi-heart"></i>
                        <span class="topbar-badge">4</span>
                        <span class="topbar-item-name">Notifications</span>
                    </a>
                    <ul class="fadeInDown">
                        <li role="menuitem">
                            <a
                                href="#"
                                (click)="appMain.onTopbarSubItemClick($event)"
                            >
                                <i class="pi pi-sliders-h"></i>
                                <span>Pending tasks</span>
                            </a>
                        </li>
                        <li role="menuitem">
                            <a
                                href="#"
                                (click)="appMain.onTopbarSubItemClick($event)"
                            >
                                <i class="pi pi-calendar"></i>
                                <span>Meeting today at 3pm</span>
                            </a>
                        </li>
                        <li role="menuitem">
                            <a
                                href="#"
                                (click)="appMain.onTopbarSubItemClick($event)"
                            >
                                <i class="pi pi-download"></i>
                                <span>Download documents</span>
                            </a>
                        </li>
                        <li role="menuitem">
                            <a
                                href="#"
                                (click)="appMain.onTopbarSubItemClick($event)"
                            >
                                <i class="pi pi-ticket"></i>
                                <span>Book flight</span>
                            </a>
                        </li>
                    </ul>
                </li>
                <li
                    #search
                    class="search-item"
                    [ngClass]="{
                        'active-topmenuitem':
                            appMain.activeTopbarItem === search
                    }"
                    (click)="appMain.onTopbarItemClick($event, search)"
                >
                    <span class="p-input-icon-right">
                        <input type="text" pInputText placeholder="Pesquisar" />
                        <i class="topbar-icon pi pi-search"></i>
                    </span>
                </li>
            </ul>
        </div>
    `,
})
export class AppTopbarComponent {
    constructor(public appMain: AppMainComponent) {}
}
