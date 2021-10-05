import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RecuperarSenha2Component } from './recuperar-senha2.component';

describe('RecuperarSenha2Component', () => {
  let component: RecuperarSenha2Component;
  let fixture: ComponentFixture<RecuperarSenha2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RecuperarSenha2Component ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RecuperarSenha2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
