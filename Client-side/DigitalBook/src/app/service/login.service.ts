import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
const api = "http://localhost:8081/api/auth";
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};
@Injectable({
  providedIn: 'root'
})
export class LoginService {
  requestHeader = new HttpHeaders({ "No-Auth": "True" });
  constructor(private httpClient:HttpClient) { }

  readerLogin(username: string, password: string):Observable<any>{
    return this.httpClient.post<any>(api+"/signin",{
      username,
      password
    }
    , httpOptions);
  }
  register(username: string, email: string, password: string, role:any): Observable<any> {
    return this.httpClient.post(api + '/signup', {
      username,
      email,
      password,
      role
    }, httpOptions);
  }
}
