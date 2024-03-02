import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Disp2Component } from './disp2.component';

describe('Disp2Component', () => {
  let component: Disp2Component;
  let fixture: ComponentFixture<Disp2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Disp2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Disp2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
