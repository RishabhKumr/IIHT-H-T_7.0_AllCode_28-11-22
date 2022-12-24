import { Component, OnInit } from '@angular/core';
import { BookInfo } from 'src/app/entity/BookInfo';
import { SearchService } from 'src/app/service/search.service';

@Component({
  selector: 'app-reader-search',
  templateUrl: './reader-search.component.html',
  styleUrls: ['./reader-search.component.css']
})
export class ReaderSearchComponent implements OnInit {
  books:BookInfo[]=[];
  constructor(private searchService:SearchService) { }
  searchType:string;
  message:string;
  ngOnInit(): void {
    this.searchType = sessionStorage.getItem("type");
    if(this.searchType === "Title"){
    console.log(sessionStorage.getItem('query'));
    const promise = this.searchService.getBookByTitle(sessionStorage.getItem('query'));
    promise.subscribe((response) => {
      console.log(response);
      this.books = response as BookInfo[];
    })
  }
  else if(this.searchType === "Category")
  {
    const promise = this.searchService.getBookByCategory(sessionStorage.getItem('query'));
    promise.subscribe((response) => {
      this.books = response as BookInfo[];
    })
  
  }
  else
  {
    this.message = "No Book Found!";
  }
  }
  alertMethod(){
    alert("Refer My Books to read!");
  }
}
