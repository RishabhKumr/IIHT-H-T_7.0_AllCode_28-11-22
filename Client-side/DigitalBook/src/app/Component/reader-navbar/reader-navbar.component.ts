import { Token } from '@angular/compiler/src/ml_parser/tokens';
import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from 'src/app/service/token-storage.service';

@Component({
  selector: 'app-reader-navbar',
  templateUrl: './reader-navbar.component.html',
  styleUrls: ['./reader-navbar.component.css']
})
export class ReaderNavbarComponent implements OnInit {

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
