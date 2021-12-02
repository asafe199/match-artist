import { Component, OnInit } from '@angular/core';
import { CountryService } from 'src/app/demo/service/countryservice';

@Component({
  selector: 'app-cad-endereco',
  templateUrl: './cad-endereco.component.html',
  styleUrls: ['./cad-endereco.component.scss']
})
export class CadEnderecoComponent implements OnInit {

  municipios: string[];

  maskNumero: any;

  maskCep: any;

  countries: any[];

  cidades: any;

  filteredCountries: any[];

  constructor() {
    
  }

  ngOnInit(): void {
    
  }

  
  

}
