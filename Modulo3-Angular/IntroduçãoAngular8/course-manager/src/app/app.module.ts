import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { CourseModule } from './courses/course.module';

import { Error404Component } from './core/component/error-404/error-404.component';
import { NavBarComponent } from './nav-bar/nav-bar.component';
import { CoreModule } from './core/core.module';


@NgModule({
  declarations: [
    AppComponent,
    Error404Component,    
    NavBarComponent    
  ],

  imports: [
    BrowserModule,
    HttpClientModule,
    CourseModule,
    CoreModule,
    RouterModule.forRoot ([
      {
        path: 'courses', component: CourseListComponent
      },
      {
        path: 'courses/info/:id', component: CourseInfoComponent
      },
      {

        path: '', redirectTo: 'courses', pathMatch: 'full'
      }, 
      {
        path: '**', component: Error404Component
      }
    ]),
    CourseModule,
    CoreModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
