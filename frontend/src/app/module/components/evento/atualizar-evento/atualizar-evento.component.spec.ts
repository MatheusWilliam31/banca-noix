import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AtualizarEventoComponent } from './atualizar-evento.component';

describe('AtualizarEventoComponent', () => {
  let component: AtualizarEventoComponent;
  let fixture: ComponentFixture<AtualizarEventoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AtualizarEventoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AtualizarEventoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
