import { Component } from '@angular/core';
import { FloatLabelModule } from 'primeng/floatlabel';
import { ButtonModule } from 'primeng/button';

@Component({
  selector: 'app-cadastro',
  imports: [
    FloatLabelModule,
    ButtonModule
  ],
  templateUrl: './cadastro.component.html',
  styleUrl: './cadastro.component.css'
})
export class CadastroComponent {

}
