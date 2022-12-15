import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Observable } from 'rxjs';
import User from 'src/app/Entity/User';
import { UserService } from 'src/app/Services/user.service';
@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  title:String='please fill the form';
  // firstName:String='';
  // lastName:String='';
  // age=0;
  // gender:String='male';
  // email='';
  user:User= new User();
  save(){
    const observables = this.userService.saveUser(this.user);
    observables.subscribe((response:any)=>{
      console.log(response);
    },function(error){
      console.log(error);
      alert("Something went wrong, please try again");
    })
  }

  constructor(private userService:UserService) { }

  ngOnInit(): void {
  }

}
