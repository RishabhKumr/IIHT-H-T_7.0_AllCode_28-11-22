import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateBookComponent } from './Components/create-book/create-book.component';
import { GetBooksComponent } from './Components/get-books/get-books.component';
import { HomeComponent } from './Components/home/home.component';
import { SearchBokComponent } from './Components/search-bok/search-bok.component';

const routes: Routes = [{
  path:"",component:HomeComponent
},
{
  path:"create",component:CreateBookComponent
},
{
  path:"getbook",component:GetBooksComponent
},
{
  path:"result",component:SearchBokComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
