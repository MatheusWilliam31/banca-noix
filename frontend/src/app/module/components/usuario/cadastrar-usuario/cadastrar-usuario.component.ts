import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MessageService, SelectItem } from 'primeng';
import { Cargo } from 'src/app/model/cargo';
import { CargoService } from 'src/service/cargo/cargo.service';
import { UsuarioService } from 'src/service/usuario/usuario.service';


@Component({
  selector: 'app-cadastro-usuario',
  templateUrl: './cadastro-usuario.component.html',
  styleUrls: ['./cadastro-usuario.component.css']
})

export class CadastrarUsuarioComponent implements OnInit{

    @Input() tituloInterno: string = '';

  public submitted = false;
  public form: FormGroup;
  public formBuilder: FormBuilder = new FormBuilder;
  public cargos: SelectItem[] = [];

  constructor (
      private usuarioSerice: UsuarioService,
      private cargoService: CargoService
    ){    }

  ngOnInit(): void {
      this.criarFormulario();
      this.obterCargos();
  }

  public criarFormulario():void {
      this.form = this.formBuilder.group({
          id: [null],
          nome: ['', Validators.required],
          cpf: ['', Validators.required],
          email: ['', Validators.required],
          cargo: [null, Validators.required],
          dataNascimento: ['', Validators.required],
          status: [true, Validators.required],
          telefone: ['']
      })
  }

  public obterCargos():void {
      this.cargoService.listar().subscribe((cargos : SelectItem []) => this.cargos = cargos);
}

    public formatarDataformulario(): Date {
        let dataSplit: string[] = (this.form.get('dataNascimento').value as String).split("/");
        return new Date(`${dataSplit[2]}-${dataSplit[1]}-${dataSplit[0]}T00:00:00`);
    }

//     public submit():void {
//       if(this.form.valid){
//           FuncoesUtil.messagemErro(this.messageService, MessageUtils);
//           return;
//       }
//       this.form.get('dataNascimento').setValue(this.formatarDataFormulario());
//       this.form.get('cargo').setValue({value:this.form.get('cargo').value})
//       this.usuarioSerice.criar(this.form.getRawValue()).subscribe{
//           (usuarioApp : UsuarioApp) => FuncoesUtil.messagemSucesso(this.messagemService,
//           () =>FuncoesUtil.messagemErro(this.messageService, MessageUtils))
//       }
//   }

  public inicializarCabecalho(): void {
      if(this.tituloInterno.length == 0){
          this.tituloInterno = "Cadastrar Usuário";
      }
  }

  public cancel(): void {
    this.submitted = false;
    this.form.reset();
    // console.log('onCancel');
  }
}
