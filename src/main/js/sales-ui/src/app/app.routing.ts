import { NgModule } from '@angular/core';
import { CommonModule, } from '@angular/common';
import { BrowserModule  } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';

import { MainPageComponent } from './main-page/main-page.component';

const routes: Routes =[
  {
    path: '',
    redirectTo: 'about',
    pathMatch: 'full',
  }, {
    path: '',
    component: MainPageComponent,
    children: [{
      path: '',
      loadChildren: './main-page/main-page.module#MainPageModule'
    }]
  }
];

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule.forRoot(routes,{
       useHash: true
    })
  ],
  exports: [
  ],
})
export class AppRoutingModule { }
