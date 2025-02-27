import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { NgFor } from '@angular/common';

import { InputTextModule } from 'primeng/inputtext';
import { InputNumberModule } from 'primeng/inputnumber';
import { ButtonModule } from 'primeng/button';

import { Livro } from '../../models/livro';
import { EstanteService } from '../../services/estante.service';

@Component({
  selector: 'app-estante',
  imports: [
    InputTextModule,
    InputNumberModule,
    ButtonModule,
    FormsModule,
    NgFor
  ],
  templateUrl: './estante.component.html',
  styleUrl: './estante.component.css'
})
export class EstanteComponent {
  livros: Livro[] = [];
  titulo: string = '';
  autor: string = '';
  ano: number = 0;
  capa: string = '';


  constructor(private estanteService: EstanteService) {
    this.estanteService.getLivros().subscribe(livros => {
      this.livros = livros;
    });
  }

  adicionarLivro(){
    if(this.titulo && this.autor && this.ano && this.capa){
      this.estanteService.adicionarLivro(this.titulo, this.autor, this.ano, this.capa);
      this.titulo = '';
      this.autor = '';
      this.ano = 0;
      this.capa = '';
    }
  }

  removerLivro(titulo: string){
    this.estanteService.removerLivro(titulo);
  }
}
