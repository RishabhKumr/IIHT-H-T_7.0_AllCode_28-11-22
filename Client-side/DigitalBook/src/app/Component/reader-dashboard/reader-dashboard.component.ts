import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Book } from 'src/app/entity/Book';
import { TokenStorageService } from 'src/app/service/token-storage.service';
import { UserService } from 'src/app/service/user.service';
@Component({
  selector: 'app-reader-dashboard',
  templateUrl: './reader-dashboard.component.html',
  styleUrls: ['./reader-dashboard.component.css']
})
export class ReaderDashboardComponent implements OnInit {

  content?: string;
  books:Book[] = [];
  isLoggedIn = false;
  constructor(private userService: UserService, private tokenStorage: TokenStorageService, private router: Router) { }

  ngOnInit(): void {
    this.isLoggedIn = !!this.tokenStorage.getToken();
    if (this.isLoggedIn) {
      this.userService.getUserBoard().subscribe(
        data => {

          this.content = data;
        },
        err => {
          this.content = JSON.parse(err.error).message;
        }
      );
      const promise = this.userService.getAllBook();
      promise.subscribe( (response) => {
          this.books = response as Book[];
          console.log(this.books);
        });
    }
    else {
      this.router.navigate(['']);
    }
  }
}
