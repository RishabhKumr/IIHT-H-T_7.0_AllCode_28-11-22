import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import {Book} from 'src/app/Entity/Book'
import {Router} from '@angular/router'
@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html',
  styleUrls: ['./nav-bar.component.css']
})
export class NavBarComponent implements OnInit {
  book:any;
  constructor(private router: Router) { }
  ngOnInit(): void {
  }
  
  saveQueryToSessionStorage(f:NgForm){
    sessionStorage.setItem("query",String(this.book));
    this.router.navigate(['/result'])
    f.resetForm();
  }
}
