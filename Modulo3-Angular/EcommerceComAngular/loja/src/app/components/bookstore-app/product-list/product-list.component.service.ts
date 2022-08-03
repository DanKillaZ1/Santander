import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Book } from "../model/book";


@Injectable()

export class BooksService {
    static getBook() {
      throw new Error('Method not implemented.');
    }

    private url = "http://localhost:4200/";

    httpOptions = {
        headers: new HttpHeaders({'content-type': 'application/json'}),
    }

    constructor(private http: HttpClient){ }

    getBooks() {
        return this.http.get(this.url );
    }

}