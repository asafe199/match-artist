import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadEstabelecimentoComponent } from './cad-estabelecimento.component';

describe('CadEstabelecimentoComponent', () => {
  let component: CadEstabelecimentoComponent;
  let fixture: ComponentFixture<CadEstabelecimentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CadEstabelecimentoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CadEstabelecimentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
