import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {Book} from 'src/app/Entity/Book'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class BookServiceService {

  createBook(book:Book):Observable<String>{
    return this.http.post<String>("http://localhost:8083/add",book);
  }

  constructor(private http:HttpClient) { }
}
