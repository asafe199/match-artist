import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EstabelecimentosConfirmadosComponent } from './estabelecimentos-confirmados.component';

describe('EstabelecimentosConfirmadosComponent', () => {
  let component: EstabelecimentosConfirmadosComponent;
  let fixture: ComponentFixture<EstabelecimentosConfirmadosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EstabelecimentosConfirmadosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EstabelecimentosConfirmadosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
