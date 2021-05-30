import { Component } from '@angular/core';

@Component({
  //Selector is used to link components to html
  selector: 'app-root',
  templateUrl: './app.component.html',
  //template: '<h1>{{title}}<h1>',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'Angular Framework Project';
  message = 'Learning Angular Is FUN!!!! Yayy!!'
  component = 'This is App Component Section On The Welcome Page';
}
