import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { LoginService } from '../../Service/login.service';
import { Usuario } from '../../Modelo/Usuario';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user: Usuario[] = [] 
  form: FormGroup = new FormGroup({
    usuario: new FormControl,
    password: new FormControl
  })
  constructor(private service: ServiceService, private router: Router, private Login:LoginService) { }
  ngOnInit(): void {
  }
  
  login() {
    this.user = this.service.usuario.filter(data => {
      return data.userName === this.form.get('usuario')?.value
    })
    if(
      this.user[0] != undefined
    ) {
      if(this.user[0].contrasenia === this.form.get('password')?.value) {
        this.Login.isLogin = true;
        this.router.navigate(["inicio"]);
      } else {
        console.log("No password")
      }
    } else {
      console.log("No usuario")
      console.log(this.user)
    }
  }
  Registro(){
    this.router.navigate(["registro"]);
}
}
