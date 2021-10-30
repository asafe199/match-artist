import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DashEstabelecimentoComponent } from './dash-estabelecimento.component';

describe('DashEstabelecimentoComponent', () => {
  let component: DashEstabelecimentoComponent;
  let fixture: ComponentFixture<DashEstabelecimentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DashEstabelecimentoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DashEstabelecimentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
