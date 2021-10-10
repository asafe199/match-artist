import { Component, OnInit } from '@angular/core';

@Component({
  templateUrl: './listar-estabelecimentos-favoritos.component.html'
})
export class ListarEstabelecimentosFavoritosComponent {

  selectedState: any = null;

    states: any[] = [
        {name: 'Arizona', code: 'Arizona'},
        {name: 'California', value: 'California'},
        {name: 'Florida', code: 'Florida'},
        {name: 'Ohio', code: 'Ohio'},
        {name: 'Washington', code: 'Washington'}
    ];
}
