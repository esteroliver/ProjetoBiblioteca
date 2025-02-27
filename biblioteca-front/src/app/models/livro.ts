export class Livro{
    titulo: string;
    autor: string;
    ano: number;
    capa: string;
    disponibilidade: boolean;
  
    constructor(titulo: string, autor: string, ano: number, capa: string, disponibilidade: boolean){
      this.titulo = titulo;
      this.autor = autor;
      this.ano = ano;
      this.capa = capa;
      this.disponibilidade = disponibilidade;
    }
  }