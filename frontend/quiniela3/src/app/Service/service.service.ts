import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Usuario } from '../Modelo/Usuario';
import { Horse } from 'src/app/Modelo/Horse';
import { Jornada } from 'src/app/Modelo/Jornada';
import { Observable } from 'rxjs';
import { Paga } from '../Modelo/paga';
import { Resultado } from '../Modelo/resultado';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  
  usuario: Usuario[];
  horse: Horse[];
  jornada: Jornada[];
  paga: Paga[];
  resultado: Resultado[];
  
  constructor(private http: HttpClient) {}

  private baseUrl = 'http://localhost:8080/usuario';
  private urlh = 'http://localhost:8080/caballo';
  private urlj = 'http://localhost:8080/jornada';
  private urlp = 'http://localhost:8080/paga';
  private urlr = 'http://localhost:8080/resultado';

  getPagas(): Observable<Paga[]> {
    return this.http.get<Paga[]>(this.urlp);
  }

  setUsuarios(): void {
    this.getUsuarios().subscribe(
      (usuarios) => {
        this.usuario = usuarios; // Asigna los usuarios obtenidos a la variable local
      },
      (error) => {
        console.error('Error al cargar usuarios:', error);
      }
    );
  }

  getResultados(): Observable<Resultado[]> {
    return this.http.get<Resultado[]>(this.urlr);
  }

  getUsuarios(): Observable<Usuario[]> {
    return this.http.get<Usuario[]>(this.baseUrl);
  }

  getHorses(): Observable<Horse[]> {
    return this.http.get<Horse[]>(this.urlh);
  }

  getJornadas(): Observable<Jornada[]> {
    return this.http.get<Jornada[]>(this.urlj);
  }

  createUsuario(usuario: Usuario): Observable<Usuario[]> {
    return this.http.post<Usuario[]>(this.baseUrl, usuario);
  }

  createHorse(horse: Horse): Observable<Horse[]> {
    return this.http.post<Horse[]>(this.urlh, horse);
  }

  createJornada(jornada: Jornada): Observable<Jornada[]> {
    return this.http.post<Jornada[]>(this.urlj, jornada);
  }

  createPaga(paga: Paga): Observable<Paga[]> {
    return this.http.post<Paga[]>(this.urlp, paga);
  }

  createResultado(resultado: Resultado): Observable<Resultado[]> {
    return this.http.post<Resultado[]>(this.urlr, resultado);
  }

  deleteUsuario(usuario: Usuario) {
    return this.http.delete<Usuario>(`${this.baseUrl}/${usuario.idUsuario}`);
  }
}
