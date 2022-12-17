import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateBookComponent } from './Components/create-book/create-book.component';
import { GetBooksComponent } from './Components/get-books/get-books.component';
import { HomeComponent } from './Components/home/home.component';

const routes: Routes = [{
  path:"",component:HomeComponent
},
{
  path:"create",component:CreateBookComponent
},
{
  path:"getbook",component:GetBooksComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
