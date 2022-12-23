import { Component, OnInit } from '@angular/core';
import { BookInfo } from 'src/app/entity/BookInfo';
import { SearchService } from 'src/app/service/search.service';

@Component({
  selector: 'app-guest-search',
  templateUrl: './guest-search.component.html',
  styleUrls: ['./guest-search.component.css']
})
export class GuestSearchComponent implements OnInit {
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
