import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { authInterceptorProviders } from './_auth/auth.interceptors';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReaderLoginComponent } from './Component/reader-login/reader-login.component';
import { ReaderDashboardComponent } from './Component/reader-dashboard/reader-dashboard.component';
import { ProfileComponent } from './Component/profile/profile.component';
import { RegisterComponent } from './Component/register/register.component';
import { HeaderAppComponent } from './Component/header-app/header-app.component';
import { HomeComponent } from './Component/home/home.component';
import { HomeNavbarComponent } from './Component/home-navbar/home-navbar.component';
import { AuthorDashboardComponent } from './Component/author-dashboard/author-dashboard.component';
import { NavbrComponent } from './Component/navbr/navbr.component';
import { GuestDashboardComponent } from './Component/guest-dashboard/guest-dashboard.component';
import { AuthorNavbarComponent } from './Component/author-navbar/author-navbar.component';
import { ReaderNavbarComponent } from './Component/reader-navbar/reader-navbar.component';
import { GuestNavbarComponent } from './Component/guest-navbar/guest-navbar.component';
import { AllBooksComponent } from './Component/all-books/all-books.component';

@NgModule({
  declarations: [
    AppComponent,
    ReaderLoginComponent,
    ReaderDashboardComponent,
    ProfileComponent,
    RegisterComponent,
    HeaderAppComponent,
    HomeComponent,
    HomeNavbarComponent,
    AuthorDashboardComponent,
    NavbrComponent,
    GuestDashboardComponent,
    AuthorNavbarComponent,
    ReaderNavbarComponent,
    GuestNavbarComponent,
    AllBooksComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
