import { SelectItem } from "primeng";
import { CargoService } from "src/service/cargo/cargo.service";
import { UsuarioService } from "src/service/usuario/usuario.service";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { Component, Input, OnInit } from "@angular/core";
import { Location } from "@angular/common";

@Component({
  selector: 'app-cadastro-usuario',
  templateUrl: './cadastrar-usuario.component.html',
  styleUrls: ['./cadastrar-usuario.component.css']
})

export class CadastrarUsuarioComponent implements OnInit {

    @Input() tituloInterno: String ='';

    public form:FormGroup;
    public submitted = false;
    public formBuilder: FormBuilder = new FormBuilder;
    public cargos: SelectItem[] = [];

    constructor (
        private usuarioService: UsuarioService, 
        private cargoService: CargoService,
        private location: Location 
    ) {   }

    ngOnInit(): void {
        this.criarFormulario();
        this.obterCargos();
    }

    public criarFormulario(): void{
        this.form = this.formBuilder.group({
            id: [null],
            nome: ['', Validators.required],
            cpf: ['', Validators.required],
            email: ['', Validators.required],
            dataNascimento: ['', Validators.required],
            telefone: [''],
            cargo: [null, Validators.required],
            status: [true, Validators.required]
        })
    }

    public obterCargos(): void {
        this.cargoService.listar().subscribe((cargos: SelectItem[]) => this.cargos = cargos);
    }

    public formatarDataFormulario(): Date {
        let dataSplit: string[] = (this.form.get('dataNascimento').value as string).split("/");
        return new Date (`${dataSplit[2]}-${dataSplit[1]}-${dataSplit[0]}T00:00:00`);
    }

    public submit(): void {
        this.submitted = true;
        console.log(this.form.value);
        if (this.form.valid){
            console.log('submit');
            this.form.get('dataNascimento').setValue(this.formatarDataFormulario());
            this.form.get('cargo').setValue({ value: this.form.get('cargo').value })
            this.usuarioService.criar(this.form.getRawValue()).subscribe(
                success => {
                    console.log('sucess');
                    this.location.back();
                },
                error => console.error(error),
                () => console.log('request completo')
            );
        }
    }

    public cancel(): void {
        this.submitted = false;
        this.form.reset();
        console.log('cancel');
    }
    
    public inicializarCabecalho(): void {
        if(this.tituloInterno.length == 0){
            this.tituloInterno = "Cadastrar Usuário";
        }
    }
}
