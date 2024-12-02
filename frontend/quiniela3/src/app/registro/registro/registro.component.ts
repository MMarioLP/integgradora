import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Usuario } from '../../Modelo/Usuario';




@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  usuario:Usuario=new Usuario();
  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
  }

  Registrar(usuario:Usuario){
    this.service.createUsuario(usuario)
    .subscribe(data=>{
      alert("Se Agrego con Exito...!!!");
      this.router.navigate(["listar"])});
  }
  Regresar(){
    this.router.navigate(["login"]);
}

}

