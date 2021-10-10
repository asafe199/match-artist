import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarEstabelecimentosFavoritosComponent } from './listar-estabelecimentos-favoritos.component';

describe('ListarEstabelecimentosFavoritosComponent', () => {
  let component: ListarEstabelecimentosFavoritosComponent;
  let fixture: ComponentFixture<ListarEstabelecimentosFavoritosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarEstabelecimentosFavoritosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarEstabelecimentosFavoritosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
