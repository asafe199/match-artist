import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PropostaDoEstabelecimentoParaOArtistaComponent } from './proposta-do-estabelecimento-para-o-artista.component';

describe('PropostaDoEstabelecimentoParaOArtistaComponent', () => {
  let component: PropostaDoEstabelecimentoParaOArtistaComponent;
  let fixture: ComponentFixture<PropostaDoEstabelecimentoParaOArtistaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PropostaDoEstabelecimentoParaOArtistaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PropostaDoEstabelecimentoParaOArtistaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
