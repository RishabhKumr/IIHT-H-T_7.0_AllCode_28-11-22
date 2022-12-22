import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthorDashboardComponent } from './Component/author-dashboard/author-dashboard.component';
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
     path: 'register', component: RegisterComponent
  },
  {
    path:"authordashboard",component:AuthorDashboardComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
