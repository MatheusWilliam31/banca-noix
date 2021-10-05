
export class Usuario {
    nome: String;
    dt_nascimento: Date;
    cpf: String;
    email: String;
    telefone: String;
    st_atividade: boolean;
    cargo: string;

constructor(usuario:any) {
    this.nome = usuario.nome;
    this.email = usuario.email;
    this.telefone = usuario.telefone;
    this.st_atividade = usuario.st_atividade;
    this.cargo = usuario.cargo;
}
 
};