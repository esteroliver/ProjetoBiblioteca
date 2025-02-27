import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Livro } from '../models/livro';

@Injectable({
  providedIn: 'root'
})
export class EstanteService {
  private livros: Livro[] = []
  private livrosSubject = new BehaviorSubject<Livro[]>([]); //gerencia o estado atual da lista de livros

  constructor() { }

  adicionarLivro(titulo: string, autor: string, ano: number, capa: string){
    const livro = new Livro(titulo, autor, ano, capa, true);
    this.livros.push(livro);
    this.livrosSubject.next(this.livros);
  }

  getLivros(): Observable<Livro[]>{
    return this.livrosSubject.asObservable();
  }

  removerLivro(titulo: string){
    this.livros = this.livros.filter(livro => livro.titulo !== titulo); //nova lista que remove o livro com o título passado
    this.livrosSubject.next(this.livros);
  }
}