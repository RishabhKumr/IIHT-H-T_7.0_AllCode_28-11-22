import { Component, OnInit } from '@angular/core';
import { BookInfo } from 'src/app/entity/BookInfo';
import { SubscribeEntity } from 'src/app/entity/SubscribeEntity';
import { SubscriptionService } from 'src/app/service/subscription.service';
import { TokenStorageService } from 'src/app/service/token-storage.service';
import { UserService } from 'src/app/service/user.service';

@Component({
  selector: 'app-reader-home',
  templateUrl: './reader-home.component.html',
  styleUrls: ['./reader-home.component.css']
})
export class ReaderHomeComponent implements OnInit {
  userId:number;
  bookId:number;
  errorMessage='';
  constructor(private userService: UserService,private tokenStorage:TokenStorageService,private subscriptionService:SubscriptionService) { }
  books:BookInfo[] = [];
  ngOnInit(): void {
    const promise = this.userService.getAllBook();
    promise.subscribe( (response) => {
        this.books = response as BookInfo[];
        console.log(this.books);
      });
  }
  subscribeEntity = new SubscribeEntity();
  subscribeMethod(book:BookInfo){
     this.userId= this.tokenStorage.getUser().id;
     console.log(this.userId);
     console.log(book.bookId);
     this.subscribeEntity.userId = this.userId;
     this.subscribeEntity.bookId = book.bookId;
     this.subscriptionService.subscribeBook(this.subscribeEntity)
     .subscribe(data =>{
       alert("Subscribed successfully, Subscription Id"+data);
     },
     err => {
      this.errorMessage = err.error.message;
      alert("Subscription failed");
     }
     )
  }
}
