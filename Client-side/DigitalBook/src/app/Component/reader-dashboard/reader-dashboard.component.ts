import { Component, OnInit } from '@angular/core';
import { UserService } from 'src/app/service/user.service';
@Component({
  selector: 'app-reader-dashboard',
  templateUrl: './reader-dashboard.component.html',
  styleUrls: ['./reader-dashboard.component.css']
})
export class ReaderDashboardComponent implements OnInit {

  content?: string;

  constructor(private userService: UserService) { }

  ngOnInit(): void {
    
    this.userService.getUserBoard().subscribe(
      data => {
        console.log(data);
        this.content = data;
      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    );
    }
}
