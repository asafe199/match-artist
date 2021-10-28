import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CriarNovoEventoComponent } from './criar-novo-evento.component';

describe('CriarNovoEventoComponent', () => {
  let component: CriarNovoEventoComponent;
  let fixture: ComponentFixture<CriarNovoEventoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CriarNovoEventoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CriarNovoEventoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
