import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { CadastroComponent } from './components/cadastro/cadastro.component';
import { LandingPageComponent } from './components/landing-page/landing-page.component';

@Component({
  selector: 'app-root',
  imports: [
    RouterOutlet, 
    LoginComponent,
    CadastroComponent,
    LandingPageComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'biblioteca-front';
}
