import { Component, OnInit } from '@angular/core';
import { CountryService } from 'src/app/demo/service/countryservice';


@Component({
  selector: 'app-listar-estabelecimentos',
  templateUrl: './listar-estabelecimentos.component.html',
  styleUrls: ['./listar-estabelecimentos.component.scss']
})
export class ListarEstabelecimentosComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
