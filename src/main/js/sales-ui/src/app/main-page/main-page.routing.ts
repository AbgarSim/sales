import { Routes } from '@angular/router';

import { DashboardComponent } from '../dashboard/dashboard.component';
import { CVComponent } from '../cv/cv.component';
import { TableListComponent } from '../table-list/table-list.component';
import { BlogComponent } from '../blog/blog.component';
import { MapsComponent } from '../maps/maps.component';
import { AboutComponent } from 'app/about/about.component';

export const MainPageRoutes: Routes = [
    { path: 'about', component: AboutComponent },
    { path: 'dashboard', component: DashboardComponent },
    { path: 'cv', component: CVComponent },
    { path: 'table-list', component: TableListComponent },
    { path: 'blog', component: BlogComponent },
    { path: 'maps', component: MapsComponent }
];
