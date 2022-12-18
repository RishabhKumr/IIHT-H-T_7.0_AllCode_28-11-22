import { Component, OnInit } from '@angular/core';
import {Book} from 'src/app/Entity/Book';
import { BookServiceService } from 'src/app/Services/book-service.service';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-create-book',
  templateUrl: './create-book.component.html',
  styleUrls: ['./create-book.component.css']
})


export class CreateBookComponent implements OnInit {
  book = new Book();
  bookName:string="";
  constructor(private bookService:BookServiceService) { }

  onSubmit(f: NgForm){
    console.log(this.book.bookAuthor);
    console.log(this.book.bookName);
    this.bookService.createBook(this.book).subscribe(data=>{
      this.bookName = data;
    })
    f.resetForm();
    alert("Book "+this.bookName+" Created Successfully!");
  }
  
  ngOnInit(): void {
  }

}
