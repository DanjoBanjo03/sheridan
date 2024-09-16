import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MainSheridanComponent } from './main-sheridan.component';

describe('MainSheridanComponent', () => {
  let component: MainSheridanComponent;
  let fixture: ComponentFixture<MainSheridanComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MainSheridanComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MainSheridanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
