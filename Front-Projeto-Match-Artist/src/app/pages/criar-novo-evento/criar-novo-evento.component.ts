import { Component, OnInit } from '@angular/core';
import { CountryService } from 'src/app/demo/service/countryservice';

@Component({
  selector: 'app-criar-novo-evento',
  templateUrl: './criar-novo-evento.component.html',
  styleUrls: ['./criar-novo-evento.component.scss']
})
export class CriarNovoEventoComponent implements OnInit {

  countries: any[];

    cities: any[];

    filteredCountries: any[];

    value1: any;

    value2: any;

    value3: any;

    value4: any;

    value5: any;

    value6: any;

    value7: any;

    value8: any;

    value9: any;

    value10: any;

    value11: any;

    value12: any;

    constructor(private countryService: CountryService) {
        this.cities = [
            {name: 'Sertanejo', code: 'Sertanejo'},
            {name: 'Pagode', code: 'Pagode'},
            {name: 'Brega', code: 'Brega'},
            {name: 'Rock', code: 'Rock'},
            {name: 'Eletrônica', code: 'Eletrônica'}
        ];
    }

    ngOnInit() {
        this.countryService.getCountries().then(countries => {
            this.countries = countries;
        });
    }

    searchCountry(event) {
        // in a real application, make a request to a remote url with the query and
        // return filtered results, for demo we filter at client side
        const filtered: any[] = [];
        const query = event.query;
        // tslint:disable-next-line:prefer-for-of
        for (let i = 0; i < this.countries.length; i++) {
            const country = this.countries[i];
            if (country.name.toLowerCase().indexOf(query.toLowerCase()) == 0) {
                filtered.push(country);
            }
        }

        this.filteredCountries = filtered;
    }

}
