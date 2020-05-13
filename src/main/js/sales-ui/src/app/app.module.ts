import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule } from '@angular/router';


import { AppRoutingModule } from './app.routing';
import { NavigationModule } from './navigation/navigation.module';

import { AppComponent } from './app.component';

import {
  AgmCoreModule
} from '@agm/core';
import { MainPageComponent } from './main-page/main-page.component';

@NgModule({
  imports: [
    BrowserAnimationsModule,
    FormsModule,
    ReactiveFormsModule,
    HttpModule,
    NavigationModule,
    RouterModule,
    AppRoutingModule,
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyAWAnh30cu0QwisUYtZCqNuAgTTYO0acQI'
    })
  ],
  declarations: [
    AppComponent,
    MainPageComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
