import { Component, OnInit } from '@angular/core';
import { BookInfo } from 'src/app/entity/BookInfo';
import { SearchService } from 'src/app/service/search.service';

@Component({
  selector: 'app-author-search',
  templateUrl: './author-search.component.html',
  styleUrls: ['./author-search.component.css']
})
export class AuthorSearchComponent implements OnInit {
  books:BookInfo[]=[];
  constructor(private searchService:SearchService) { }

  ngOnInit(): void {
    console.log(sessionStorage.getItem('query'));
    const promise = this.searchService.getBookByTitle(sessionStorage.getItem('query'));
    promise.subscribe((response) => {
      console.log(response);
      this.books = response as BookInfo[];
    })
  }

}
