import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})

export class UserService {
  apiUrl = 'https://sheet.best/api/sheets/40c90020-62ff-42d9-9cea-2dbbd509fc76';
  httpOptions = {
    headers: new HttpHeaders ({
      'Content-Type': 'application/json',
      
    })
  }

  constructor(private httpClient: HttpClient) { }

  //C.R.U.D - Create, Read, Update, Delete

  // retorna a lista de todos os usuários

  getAllUsers():Observable<User[]> {
    return this.httpClient.get<User[]>(this.apiUrl);
  }

  //salva usuario no banco CREATE
  postUser(user: User): Observable<User> {
    return this.httpClient.post<User>(this.apiUrl, user, this.httpOptions);
  }

  //Exclui usuario do banco DELETE
  deleteUser(id: number):Observable<User> {
    return this.httpClient.delete<User>(`${this.apiUrl}/id/${id}')
  }
}
