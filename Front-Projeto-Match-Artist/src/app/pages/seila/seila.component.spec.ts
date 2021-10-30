import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SeilaComponent } from './seila.component';

describe('SeilaComponent', () => {
  let component: SeilaComponent;
  let fixture: ComponentFixture<SeilaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SeilaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SeilaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
