import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Jornada } from 'src/app/Modelo/Jornada';
import { Horse } from 'src/app/Modelo/Horse';

@Component({
  selector: 'app-jornada',
  templateUrl: './jornada.component.html',
  styleUrls: ['./jornada.component.css']
})
export class JornadaComponent implements OnInit {

  horse:Horse=new Horse();
  jornada:Jornada=new Jornada();
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit(): void {
  }

  Agregar(horse:Horse){
    this.service.createHorse(horse)
    .subscribe(data=>{
      alert("Se Agrego con Exito...!!!");
      this.router.navigate(["panel,inicio"])});
  }

  Guardar(jornada:Jornada){
    this.service.createJornada(jornada)
    .subscribe(data=>{
      alert("Se Agrego con Exito...!!!");
      this.router.navigate(["panel,inicio"])});
  }

}
