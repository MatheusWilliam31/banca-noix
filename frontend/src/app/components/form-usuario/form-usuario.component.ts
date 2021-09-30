import { Component, OnInit } from '@angular/core';
import { EmailValidator, FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
    selector: 'form-usuario',
    templateUrl: './form-usuario.component.html',
    styleUrls: ['./style.component.scss']
})
export class FormUsuarioComponent implements OnInit{

    form: FormGroup;
    submitted = false;
    
    constructor (private fb: FormBuilder){    }

    ngOnInit(){
        this.form = this.fb.group({
            nome: [null, [Validators.required, Validators.maxLength(50), Validators.minLength(3)]],
            email: [null, [Validators.required, EmailValidator]],
            cpf: [null, [Validators.required]],
            data: [null, [Validators.required]],
            telefone: [null, [Validators.required]],
            cargo: [null, [Validators.required]]
        });
    }


    onSubmit(){
        this.submitted = true;
        console.log(this.form.value);

        if(this.form.valid){
            console.log("enviando");
        }
    }


    hasError(field: string){
        return this.form.get(field).errors;
    }


    onCancel(){
        this.submitted = false;
        this.form.reset();
    }
}