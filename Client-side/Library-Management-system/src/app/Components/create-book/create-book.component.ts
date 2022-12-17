import { Component, OnInit } from '@angular/core';
import {Book} from 'src/app/Entity/Book'
import { BookServiceService } from 'src/app/Services/book-service.service';
import {Router} from '@angular/router'
@Component({
  selector: 'app-create-book',
  templateUrl: './create-book.component.html',
  styleUrls: ['./create-book.component.css']
})
export class CreateBookComponent implements OnInit {
  book = new Book();
  bookName:String="";
  constructor(private bookService:BookServiceService,private router:Router) { }

  onSubmit(){
    this.bookService.createBook(this.book).subscribe(data=>{
      this.bookName = data;
    })
  }
  
  ngOnInit(): void {
  }

}
