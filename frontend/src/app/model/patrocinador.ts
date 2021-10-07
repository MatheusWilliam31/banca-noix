import { SelectItem } from "primeng";

export class Patrocinador{
    id: number;
    nome: string;
    email: string;
    cargo: SelectItem;


    constructor(patrocinador: Patrocinador) {
        this.id = patrocinador.id;
        this.nome = patrocinador.nome;
        this.email = patrocinador.email;
        this.cargo = patrocinador.cargo;
     
    }

}