import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PerfilEstabelecimentoComponent } from './perfil-estabelecimento.component';

describe('PerfilEstabelecimentoComponent', () => {
  let component: PerfilEstabelecimentoComponent;
  let fixture: ComponentFixture<PerfilEstabelecimentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PerfilEstabelecimentoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PerfilEstabelecimentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
