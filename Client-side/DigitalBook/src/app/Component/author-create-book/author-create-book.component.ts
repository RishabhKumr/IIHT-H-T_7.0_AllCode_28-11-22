import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Book } from 'src/app/entity/Book';

@Component({
  selector: 'app-author-create-book',
  templateUrl: './author-create-book.component.html',
  styleUrls: ['./author-create-book.component.css']
})
export class AuthorCreateBookComponent implements OnInit {
  book = new Book();
  constructor() { }

  ngOnInit(): void {
  }

  onSubmit(f:NgForm){
    
  }

}
