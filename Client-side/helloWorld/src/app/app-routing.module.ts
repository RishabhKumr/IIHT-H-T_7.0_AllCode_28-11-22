import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './Components/about/about.component';
import { ContactUsComponent } from './Components/contact-us/contact-us.component';
import { HomeComponent } from './Components/home/home.component';
import { UserFormComponent } from './Components/user-form/user-form.component';

const routes: Routes = [
  {
    path:"",component:HomeComponent
  },
  {
    path:"register",component:UserFormComponent
  },
  {
    path:"about",component:AboutComponent
  },
  {
    path:"contactus",component:ContactUsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
