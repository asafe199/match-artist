import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CadArtistaComponent } from './cad-artista.component';

describe('CadArtistaComponent', () => {
  let component: CadArtistaComponent;
  let fixture: ComponentFixture<CadArtistaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CadArtistaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CadArtistaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
