import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SolicitacaoDoArtistaParaEventoComponent } from './solicitacao-do-artista-para-evento.component';

describe('SolicitacaoDoArtistaParaEventoComponent', () => {
  let component: SolicitacaoDoArtistaParaEventoComponent;
  let fixture: ComponentFixture<SolicitacaoDoArtistaParaEventoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SolicitacaoDoArtistaParaEventoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SolicitacaoDoArtistaParaEventoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
