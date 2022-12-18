import { Component, OnInit } from '@angular/core';
import { BookServiceService } from 'src/app/Services/book-service.service';
import {Book} from 'src/app/Entity/Book';

@Component({
  selector: 'app-get-books',
  templateUrl: './get-books.component.html',
  styleUrls: ['./get-books.component.css']
})
export class GetBooksComponent implements OnInit {

  books:Book[] = [];
  constructor(private bookService:BookServiceService) { }

  deleteBook(book:Book,index: number){
    const observables = this.bookService.deleteUsers(book);
    observables.subscribe((response:any)=>{
      console.log(response);
      this.books.splice(index,1);
    })
  }

  ngOnInit(): void {
    const promise = this.bookService.getBooks();
    promise.subscribe((response) => {
      console.log(Response);
      this.books = response as Book[];
    })
  }
}
