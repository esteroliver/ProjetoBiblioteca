import { Component } from '@angular/core';
import { EstanteService } from '../../services/estante.service';
import { InputTextModule } from 'primeng/inputtext';
import { InputNumberModule } from 'primeng/inputnumber';

@Component({
  selector: 'app-estante',
  imports: [
    InputTextModule,
    InputNumberModule
  ],
  templateUrl: './estante.component.html',
  styleUrl: './estante.component.css'
})
export class EstanteComponent {
  constructor(private estanteService: EstanteService) {}
}
