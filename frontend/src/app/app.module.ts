import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {Http, HttpModule} from '@angular/http';
import { AppComponent } from './app.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatButtonModule} from '@angular/material/button';
import { MDBBootstrapModule } from 'angular-bootstrap-md';
import {Routes, RouterModule} from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { NavbarComponent } from './navbar/navbar.component';
import { MainComponent } from './main/main.component';
import { RestaurantItemComponent } from './restaurant-item/restaurant-item.component';
import { RestaurantCollectionComponent } from './restaurant-collection/restaurant-collection.component';
import { ApiSpringService } from './api-spring.service';


const appRoute = [
  {path: 'restaurant' , component: RestaurantItemComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    MainComponent,
    RestaurantItemComponent,
    RestaurantCollectionComponent,

  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MDBBootstrapModule.forRoot(),
    RouterModule.forRoot(appRoute),
  ],
  providers: [ApiSpringService],
  bootstrap: [AppComponent]
})
export class AppModule { }
