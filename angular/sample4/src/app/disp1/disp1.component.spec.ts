import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Disp1Component } from './disp1.component';

describe('DispComponent', () => {
  let component: Disp1Component;
  let fixture: ComponentFixture<Disp1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Disp1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Disp1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
