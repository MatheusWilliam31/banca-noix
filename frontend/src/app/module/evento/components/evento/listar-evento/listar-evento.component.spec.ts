import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarEventoComponent } from './listar-evento.component';

describe('ListarEventoComponent', () => {
  let component: ListarEventoComponent;
  let fixture: ComponentFixture<ListarEventoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListarEventoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListarEventoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
