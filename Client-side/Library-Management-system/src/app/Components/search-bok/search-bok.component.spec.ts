import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchBokComponent } from './search-bok.component';

describe('SearchBokComponent', () => {
  let component: SearchBokComponent;
  let fixture: ComponentFixture<SearchBokComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SearchBokComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchBokComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
