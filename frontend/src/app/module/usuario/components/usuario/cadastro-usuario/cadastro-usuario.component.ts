<<<<<<< HEAD
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { Component, Input, OnInit } from '@angular/core';
import { MessageService, SelectItem } from 'primeng';
=======
import { Component, Input, OnInit } from '@angular/core';
import { EmailValidator, FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MessageService, SelectItem } from 'primeng';
import { Cargo } from 'src/app/model/cargo';
>>>>>>> 801d201c4ab3496d6622a64aa20d9068e7082577
// import { CadastroUsuarioService } from 'src/app/service/cadastro-usuario.service';
// import { CargoService } from 'src/app/service/cargo.sevice';

@Component({
  selector: 'app-cadastro-usuario',
  templateUrl: './cadastro-usuario.component.html',
<<<<<<< HEAD
=======
  styleUrls: ['./cadastro-usuario.component.css']
>>>>>>> 801d201c4ab3496d6622a64aa20d9068e7082577
})

export class CadastroUsuarioComponent implements OnInit{

    @Input() tituloInterno: string = '';
    // @Input() usuario: UsuarioApp = null;

  public form: FormGroup;
  public formBuilder: FormBuilder = new FormBuilder;
  public cargos: SelectItem[] = [];

  constructor (
      private messageService: MessageService,
    //   private usuarioSerice: CadastroUsuarioService,
    //   private cargoService: CargoService
    ){    }

  ngOnInit(): void {
      this.criarFormulario();
    //   this.obterCargos();
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

//   public obterCargos():void {
//       this.cargoService.listar().subscribe((cargos : SelectItem [] => this.cargos = cargos);
// }

    // public formatarDataformulario(): Date {
    //     let dataSplit: string[] = (this.form.get('dataNascimento').value as String).split
    // }

//   public submit():void {
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
}
