import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EstanteService {
  constructor() { }
}

class Livro{
  titulo: string;
  autor: string;
  ano: number;
  disponibilidade: boolean;

  constructor(titulo: string, autor: string, ano: number, disponibilidade: boolean){
    this.titulo = titulo;
    this.autor = autor;
    this.ano = ano;
    this.disponibilidade = disponibilidade;
  }
}