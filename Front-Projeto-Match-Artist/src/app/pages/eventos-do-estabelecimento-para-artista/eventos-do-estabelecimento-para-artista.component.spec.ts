import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventosDoEstabelecimentoParaArtistaComponent } from './eventos-do-estabelecimento-para-artista.component';

describe('EventosDoEstabelecimentoParaArtistaComponent', () => {
  let component: EventosDoEstabelecimentoParaArtistaComponent;
  let fixture: ComponentFixture<EventosDoEstabelecimentoParaArtistaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EventosDoEstabelecimentoParaArtistaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EventosDoEstabelecimentoParaArtistaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
