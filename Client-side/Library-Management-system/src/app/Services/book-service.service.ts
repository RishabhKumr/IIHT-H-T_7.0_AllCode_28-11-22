import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {Book} from 'src/app/Entity/Book'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class BookServiceService {

  createBook(book:Book):Observable<string>{
    return this.http.post<string>("http://localhost:8083/add",book);
  }

  constructor(private http:HttpClient) { }

  getBooks(){
    return this.http.get("http://localhost:8083/allBooks");
  }

  deleteUsers(book:Book){
    return this.http.delete("http://localhost:8083/remove"+"/"+book.bookId);
  }

  searchBook(id: number){
    return this.http.get("http://localhost:8083/read/"+id);
  }
}
