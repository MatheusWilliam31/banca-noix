import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CriarUsuariosComponent } from './criar-usuarios.component';

describe('CriarUsuariosComponent', () => {
  let component: CriarUsuariosComponent;
  let fixture: ComponentFixture<CriarUsuariosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CriarUsuariosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CriarUsuariosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
