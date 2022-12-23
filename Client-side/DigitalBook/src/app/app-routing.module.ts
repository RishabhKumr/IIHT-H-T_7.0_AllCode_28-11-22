import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthorDashboardComponent } from './Component/author-dashboard/author-dashboard.component';
import { GuestDashboardComponent } from './Component/guest-dashboard/guest-dashboard.component';
import { GuestHomeComponent } from './Component/guest-home/guest-home.component';
import { GuestSearchComponent } from './Component/guest-search/guest-search.component';
import { HomeComponent } from './Component/home/home.component';
import { ProfileComponent } from './Component/profile/profile.component';
import { ReaderDashboardComponent } from './Component/reader-dashboard/reader-dashboard.component';
import { ReaderLoginComponent } from './Component/reader-login/reader-login.component';
import { RegisterComponent } from './Component/register/register.component';

const routes: Routes = [
  {
    path:"",component:HomeComponent
  },
  {
    path:"login",component:ReaderLoginComponent,
    children:[
     
    ]
  },
  {
    path:"readerdashboard",component:ReaderDashboardComponent
  },
  { 
    path: 'profile', component: ProfileComponent
   },
  {
    path:"authordashboard",component:AuthorDashboardComponent
  },
  {
    path:"guestdashboard",component:GuestDashboardComponent,
    children:[
      {
        path:"",component:GuestHomeComponent
      },
      { 
        path: 'register', component: RegisterComponent
     },
     {
       path:'search',component:GuestSearchComponent
     }
     
    ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
