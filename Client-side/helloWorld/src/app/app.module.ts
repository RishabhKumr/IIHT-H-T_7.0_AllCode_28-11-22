import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './Components/home/home.component';
import { HeaderComponent } from './Components/header/header.component';
import { HomeNewComponent } from './Components/home-new/home-new.component';
import { UserFormComponent } from './Components/user-form/user-form.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './Components/navbar/navbar.component';
import { MatListModule } from '@angular/material/list';
import { MatMenuModule } from '@angular/material/menu';
import { AboutComponent } from './Components/about/about.component';
import { ContactUsComponent } from './Components/contact-us/contact-us.component';
import {HttpClientModule } from '@angular/common/http';
import { RegUsersComponent } from './Components/reg-users/reg-users.component';
import { PipesComponent } from './pipes/pipes.component';
import { EllipsisPipe } from './pipes/ellipsis.pipe'

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    HomeNewComponent,
    UserFormComponent,
    NavbarComponent,
    AboutComponent,
    ContactUsComponent,
    RegUsersComponent,
    PipesComponent,
    EllipsisPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    BrowserAnimationsModule,
    MatListModule,
    MatMenuModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
