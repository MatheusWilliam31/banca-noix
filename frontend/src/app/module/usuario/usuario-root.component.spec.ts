import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UsuarioRootComponent } from './usuario-root.component';

describe('UsuarioRootComponent', () => {
  let component: UsuarioRootComponent;
  let fixture: ComponentFixture<UsuarioRootComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UsuarioRootComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UsuarioRootComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
