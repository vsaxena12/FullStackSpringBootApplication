import { CompileShallowModuleMetadata } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { WelcomeDataService } from '../service/data/welcome-data.service';

@Component({
  selector: 'app-welcome',
  templateUrl: './welcome.component.html', //calling HTML
  styleUrls: ['./welcome.component.scss'] //calling CSS
})
export class WelcomeComponent implements OnInit {

  constructor(private route: ActivatedRoute,
    private service: WelcomeDataService) { }

  ngOnInit(): void {
  }

  getWelcomeMessage(){
    //console.log("Welcome my Friend!")
    console.log(this.service.executeservice());

    this.service.executeservice().subscribe();
  }
 
}
