import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../../Service/service.service';
import { Horse } from 'src/app/Modelo/Horse';
import { Jornada } from 'src/app/Modelo/Jornada';

@Component({
  selector: 'app-panel',
  templateUrl: './panel.component.html',
  styleUrls: ['./panel.component.css']
})
export class PanelComponent implements OnInit {

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

   
}
