import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MainPageRoutes } from './main-page.routing';
import { DashboardComponent } from '../dashboard/dashboard.component';
import { CVComponent } from '../cv/cv.component';
import { TableListComponent } from '../table-list/table-list.component';
import { BlogComponent } from '../blog/blog.component';
import { MapsComponent } from '../maps/maps.component';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { MatRippleModule } from '@angular/material/core';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatTooltipModule } from '@angular/material/tooltip';
import { MatSelectModule } from '@angular/material/select';
import { AboutComponent } from '../about/about.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forChild(MainPageRoutes),
    FormsModule,
    ReactiveFormsModule,
    MatButtonModule,
    MatRippleModule,
    MatFormFieldModule,
    MatInputModule,
    MatSelectModule,
    MatTooltipModule,
    HttpClientModule
  ],
  declarations: [
    AboutComponent,
    DashboardComponent,
    CVComponent,
    TableListComponent,
    BlogComponent,
    MapsComponent,
  ]
})

export class MainPageModule { }
