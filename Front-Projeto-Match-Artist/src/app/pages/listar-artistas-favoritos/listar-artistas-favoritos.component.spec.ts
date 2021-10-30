import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarArtistasFavoritosComponent } from './listar-artistas-favoritos.component';

describe('ListarArtistasFavoritosComponent', () => {
  let component: ListarArtistasFavoritosComponent;
  let fixture: ComponentFixture<ListarArtistasFavoritosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarArtistasFavoritosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarArtistasFavoritosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
