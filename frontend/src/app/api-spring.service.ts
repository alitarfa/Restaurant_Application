import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiSpringService {

  httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    '': '*'
  })};

  constructor(private API: HttpClient) { }

  public getListRestaurant() {
    return this.API.get('http://localhost:8080/restaurant');
  }
}
