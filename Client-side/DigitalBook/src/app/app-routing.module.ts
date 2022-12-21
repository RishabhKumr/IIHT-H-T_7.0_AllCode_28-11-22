import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProfileComponent } from './Component/profile/profile.component';
import { ReaderDashboardComponent } from './Component/reader-dashboard/reader-dashboard.component';
import { ReaderLoginComponent } from './Component/reader-login/reader-login.component';

const routes: Routes = [
  {
    path:"readerlogin",component:ReaderLoginComponent
  },
  {
    path:"readerdashboard",component:ReaderDashboardComponent
  },
  { 
    path: 'profile', component: ProfileComponent
   },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
