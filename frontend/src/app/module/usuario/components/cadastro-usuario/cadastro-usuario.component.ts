import { CadastroUsuarioService } from 'src/service/evento/cadastro-usuario.service';
import { Usuario } from './../../../../model/menu-bar';
import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MessageService, SelectItem } from 'primeng';
import { CargoService } from 'src/service/cargo/cargo.service';

@Component({
  selector: 'app-cadastro-usuario',
  templateUrl: './cadastro-usuario.component.html',
  styleUrls: ['./cadastro-usuario.component.css']
})

export class CadastroUsuarioComponent implements OnInit{

    @Input() tituloInterno: string = '';
    @Input() usuario: Usuario = null;

    private submitted = false;
    private form: FormGroup;
    private formBuilder: FormBuilder = new FormBuilder;
    private cargos: SelectItem[] = [];

    constructor (
        private messageService: MessageService,
        private usuarioSerice: CadastroUsuarioService,
        private cargoService: CargoService
        ){    }

    ngOnInit(): void {
        this.criarFormulario();
        this.obterCargos();
    }
  obterCargos() {
    throw new Error('Method not implemented.');
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



    public formatarDataformulario(): Date {
        let dataSplit: string[] = (this.form.get('dataNascimento').value as string).split("/");
        return new Date(`${dataSplit[2]}-${dataSplit[1]}-${dataSplit[0]}T00:00:00`);
    }

    public inicializarCabecalho(): void {
        if(this.tituloInterno.length == 0){
            this.tituloInterno = "Cadastrar Usuário";
        }
    }

//    public submit():void {
//      if(this.form.valid){
//          FuncoesUtil.messagemErro(this.messageService, MessageUtils);
//          return;
//      }
//      this.form.get('dataNascimento').setValue(this.formatarDataformulario());
//      this.form.get('cargo').setValue({value:this.form.get('cargo').value})
//      this.usuarioSerice.criar(this.form.getRawValue()).subscribe{
//          (usuario : Usuario) => FuncoesUtil.messagemSucesso(this.messagemService,
//          () =>FuncoesUtil.messagemErro(this.messageService, MessageUtils))
//      }
//  }

    onCancel(){
        this.submitted = false;
        this.form.reset();
    }
}