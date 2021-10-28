import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MeusEventosDeEstabelecimentoComponent } from './meus-eventos-de-estabelecimento.component';

describe('MeusEventosDeEstabelecimentoComponent', () => {
  let component: MeusEventosDeEstabelecimentoComponent;
  let fixture: ComponentFixture<MeusEventosDeEstabelecimentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MeusEventosDeEstabelecimentoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MeusEventosDeEstabelecimentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
