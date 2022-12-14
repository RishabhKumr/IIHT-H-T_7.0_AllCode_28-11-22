import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  title:String='please fill the form';
  firstName:String='';
  lastName:String='';
  age=0;
  gender:String='male';
  email='';

  save(){
    console.log('Hello '+this.firstName+' '+this.lastName);
    console.log('your emial is '+this.email);
  }

  constructor() { }

  ngOnInit(): void {
  }

}
