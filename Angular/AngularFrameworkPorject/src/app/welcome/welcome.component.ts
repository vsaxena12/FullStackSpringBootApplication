import { Component, OnInit } from '@angular/core';

//to link two components, we need to import the modules from that component folder
import { AppComponent } from '../app.component';



@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.scss']
})
export class WelcomeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    //ngOnInit method instantiate OnInit Class
  }

}

class WelcomeTest{
  
}