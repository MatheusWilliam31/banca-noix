import { Component, SimpleChanges, OnInit, Input, Output, EventEmitter, ChangeDetectionStrategy, OnChanges } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Evento } from 'src/app/model/Evento';


@Component({
  selector: './app-cadastrar-evento',
  styleUrls: ['./cadastrar-evento.component.css'],
  template: `
  <div #calendar></div>
  `,
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class CadastrarEventoComponent implements OnChanges {
  @Input() evento: Evento;
  @Input() isNew: boolean;
  @Output() close = new EventEmitter();
  @Output() add = new EventEmitter<Evento>();
  @Output() update = new EventEmitter<Evento>();
  form = this.formBuilder.group({
    nome: [null, Validators.required],
    data: [null],
    situacao: [],
    valor: []
  })
  constructor(private formBuilder: FormBuilder) { }

  ngOnChanges(simpleChanges: SimpleChanges): void {
    if (simpleChanges.evento && simpleChanges.evento.currentValue) {
      this.form.patchValue({ ...this.evento });
    }
  }

  onAdd(): void {
    const {  id, nome, data, situacao, valor } = this.form.value;
  }

  onUpdate(): void {
    const {  id, nome, data, situacao, valor } = this.form.value;
  }
}