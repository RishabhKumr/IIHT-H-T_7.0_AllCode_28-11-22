import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from 'src/app/service/token-storage.service';

@Component({
  selector: 'app-author-navbar',
  templateUrl: './author-navbar.component.html',
  styleUrls: ['./author-navbar.component.css']
})
export class AuthorNavbarComponent implements OnInit {

  username:string;
  constructor(private tokenStorage:TokenStorageService) { }

  ngOnInit(): void {
    const user = this.tokenStorage.getUser();
    this.username = user.username;
  }
  logout(): void {
    this.tokenStorage.signOut();
    window.location.reload();
  }

}
