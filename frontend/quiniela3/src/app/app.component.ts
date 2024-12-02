import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from './Service/login.service';
import { ServiceService } from './Service/service.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'quiniela3';


  
  
  constructor(private router:Router, private login:LoginService, private service:ServiceService){
    this.service.setUsuarios();
    if (!login.isLogin) {
      this.router.navigate(["login"]);
    }
  }

  Listar(){
    this.router.navigate(["listar"]);
  }
  Nuevo(){
    this.router.navigate(["add"]);

}

}
