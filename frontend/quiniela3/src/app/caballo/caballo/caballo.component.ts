import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Horse } from 'src/app/Modelo/Horse';

@Component({
  selector: 'app-caballo',
  templateUrl: './caballo.component.html',
  styleUrls: ['./caballo.component.css']
})
export class CaballoComponent implements OnInit {

  horse:Horse=new Horse();

  constructor(private router:Router, private service:ServiceService) { }

  ngOnInit() {
  }

  Guardar(horse:Horse){
    this.service.createHorse(horse)
    .subscribe(data=>{
      alert("Se Agrego con Exito...!!!");
      this.router.navigate(["panel,inicio"])});
  }

}
