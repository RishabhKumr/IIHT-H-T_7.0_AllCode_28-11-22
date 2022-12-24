import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Book } from '../entity/Book';
const API_URL = 'http://localhost:8081/api/test/';
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};
@Injectable({
  providedIn: 'root'
})
export class AuthorService {

  constructor(private http: HttpClient) { }

  updateBook(book:Book,userid:number):Observable<string>{
    return this.http.put<string>(API_URL+"admin/updateBook/"+userid,book,httpOptions);
  }

  getbookIdbyTitle(title:string){
    return this.http.get(API_URL+"searchforupdate/"+title);
  }

  getAuthorNameByBookId(bookId:number){
    return this.http.get(API_URL+"getauthername/"+bookId);
  }

  getAuthorIdbyName(name:string){
    return this.http.get<number>(API_URL+"getauthoridbyname/"+name);
  }
}
