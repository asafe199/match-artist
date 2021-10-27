import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventosEstabelecimentoComponent } from './eventos-estabelecimento.component';

describe('EventosEstabelecimentoComponent', () => {
  let component: EventosEstabelecimentoComponent;
  let fixture: ComponentFixture<EventosEstabelecimentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EventosEstabelecimentoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EventosEstabelecimentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
