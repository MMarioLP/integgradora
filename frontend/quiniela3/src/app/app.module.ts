import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListarComponent } from './Persona/listar/listar.component';
import { AddComponent } from './Persona/add/add.component';
import { EditarComponent } from './Persona/editar/editar.component';

import{ServiceService}from '../app/Service/service.service';
import{HttpClientModule}from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from './login/login/login.component';
import { RegistroComponent } from './registro/registro/registro.component';
import { CaballoComponent } from './caballo/caballo/caballo.component';
import { JornadaComponent } from './jornada/jornada/jornada.component';

import { PagoComponent } from './pago/pago/pago.component';

import { PanelComponent } from './panel/panel/panel.component';
import { MenuComponent } from './menu/menu/menu.component';
import { JugarComponent } from './juego/jugar/jugar.component';
import { InicioComponent } from './juego/inicio/inicio.component';
import { ResultadosComponent } from './jugar/resultados/resultados.component';

@NgModule({
  declarations: [
    AppComponent,
    ListarComponent,
    AddComponent,
    EditarComponent,
    LoginComponent,
    RegistroComponent,
    CaballoComponent,
    JornadaComponent,
    PagoComponent,
    PanelComponent,
    MenuComponent,
    JugarComponent,
    InicioComponent,
    ResultadosComponent,
 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    ReactiveFormsModule,
    FormsModule

  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
