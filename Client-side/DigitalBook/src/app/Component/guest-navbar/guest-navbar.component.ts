import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from 'src/app/service/token-storage.service';

@Component({
  selector: 'app-guest-navbar',
  templateUrl: './guest-navbar.component.html',
  styleUrls: ['./guest-navbar.component.css']
})
export class GuestNavbarComponent implements OnInit {

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
