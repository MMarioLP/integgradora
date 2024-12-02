import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Horse } from 'src/app/Modelo/Horse';
import { Jornada } from 'src/app/Modelo/Jornada';
import { Resultado } from '../../Modelo/resultado';


@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  horses: Horse[];
  jornadas:Jornada[];
  constructor(private service: ServiceService, private router: Router) { }
 
  ngOnInit(): void {
    this.service.getJornadas()
    .subscribe(data => {
      this.jornadas = data;
      
    })
  
      this.service.getHorses()
      .subscribe(data => {
        this.horses = data;
      })
  }

  
  Apostar(){
    this.router.navigate(["jugar"]);
}
Lista(){
  this.router.navigate(["listar"]);
}

Jornada(){
  this.router.navigate(["jornada"]);
  

}

Resultado(){
  this.router.navigate(["resultados"]);
  

}

}