import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListarComponent } from './Persona/listar/listar.component';
import { AddComponent } from './Persona/add/add.component';
import { EditarComponent } from './Persona/editar/editar.component';
import { LoginComponent } from './login/login/login.component';
import { RegistroComponent } from './registro/registro/registro.component';
import { PagoComponent } from './pago/pago/pago.component';
import { JornadaComponent } from './jornada/jornada/jornada.component';
import { CaballoComponent } from './caballo/caballo/caballo.component';
import { PanelComponent } from './panel/panel/panel.component'; 
import { MenuComponent } from './menu/menu/menu.component';
import { JugarComponent } from './juego/jugar/jugar.component'; 
import { InicioComponent } from './juego/inicio/inicio.component';
import { ResultadosComponent } from './jugar/resultados/resultados.component';





const routes: Routes = [
  {path:'login', component:LoginComponent},
  {path:'registro', component:RegistroComponent},
  {path:'pago', component:PagoComponent},
  {path:'jornada', component:JornadaComponent},
  {path:'listar', component:ListarComponent},
  {path:'add',component:AddComponent},
  {path:'edit',component:EditarComponent},
  {path: 'caballo', component:CaballoComponent},
  {path: 'panel',component:PanelComponent},
  {path: 'menu',component:MenuComponent},
  {path:'jugar',component:JugarComponent},
  {path: 'inicio',component:InicioComponent},
  {path:'resultados',component:ResultadosComponent}
  



]
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
