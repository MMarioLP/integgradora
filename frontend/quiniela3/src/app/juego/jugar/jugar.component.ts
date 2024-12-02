import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Paga } from '../../Modelo/paga';
import { Horse } from '../../Modelo/Horse';
import { Jornada } from '../../Modelo/Jornada';
import { Usuario } from '../../Modelo/Usuario';

@Component({
  selector: 'app-jugar',
  templateUrl: './jugar.component.html',
  styleUrls: ['./jugar.component.css']
})
export class JugarComponent implements OnInit {
  horse:Horse=new Horse();
  jornada:Jornada=new Jornada();
  paga:Paga=new Paga()
  usuario:Usuario=new Usuario();
  
  constructor(private service: ServiceService, private router: Router) { }


  ngOnInit(): void {
  }

  Apostar(paga:Paga){
    this.service.createPaga(paga)
    .subscribe(data=>{
      alert("Se Agrego con Exito...!!!");
      this.router.navigate(["resultados"])});

}
}
