import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarArtistasComponent } from './listar-artistas.component';

describe('ListarArtistasComponent', () => {
  let component: ListarArtistasComponent;
  let fixture: ComponentFixture<ListarArtistasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListarArtistasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarArtistasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
