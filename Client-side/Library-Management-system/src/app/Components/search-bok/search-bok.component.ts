import { Component, OnInit } from '@angular/core';
import { BookServiceService } from 'src/app/Services/book-service.service';
import {Book} from 'src/app/Entity/Book';

@Component({
  selector: 'app-search-bok',
  templateUrl: './search-bok.component.html',
  styleUrls: ['./search-bok.component.css']
})
export class SearchBokComponent implements OnInit {
  book:any;
  bookName:string="";
  bookAuthor:string="";
  constructor(private bookService:BookServiceService) { }

  ngOnInit(): void {
    console.log(sessionStorage.getItem('query'));
    const promise = this.bookService.searchBook(Number(sessionStorage.getItem('query')));
    promise.subscribe((response) => {
      console.log(Response);
      this.book = response;
    })
  }

}
