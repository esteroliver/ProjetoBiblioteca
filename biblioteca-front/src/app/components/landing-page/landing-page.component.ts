import { Component } from '@angular/core';
import { ButtonModule } from 'primeng/button';
import { Router } from '@angular/router';

@Component({
  selector: 'app-landing-page',
  imports: [ButtonModule],
  templateUrl: './landing-page.component.html',
  styleUrl: './landing-page.component.css'
})
export class LandingPageComponent {
  constructor(private router: Router) { }

  navegarPara(path: string){
    if(path === '/login'){
      this.router.navigate(['login']);
    } 
    else if(path === '/cadastro'){
      this.router.navigate(['cadastro']);
    }
    
  }
}
