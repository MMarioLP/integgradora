import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Horse } from 'src/app/Modelo/Horse';
import { Jornada } from 'src/app/Modelo/Jornada';
import { Paga } from '../../Modelo/paga';

@Component({
  selector: 'app-resultados',
  templateUrl: './resultados.component.html',
  styleUrls: ['./resultados.component.css']
})
export class ResultadosComponent implements OnInit {

 

  pagas:Paga[];
  
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit(): void {
    this.service.getPagas()
    .subscribe(data => {
      this.pagas = data;
      
    });

  }
}
