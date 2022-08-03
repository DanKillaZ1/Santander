import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PeopleService {

  constructor() { }

  getPeople(): Observable<any> {
    let peopleArray = [
      {firstName: 'John', lastName: 'santos', age: 30},
      {firstName: 'Jane', lastName: 'ribeiro', age: 25},
      {firstName: 'Jack', lastName: 'lucas', age: 20},
      {firstName: 'Jill', lastName: 'lopez', age: 35}
    ];
    return of(peopleArray);
  }

}
