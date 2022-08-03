import { Component, OnInit } from '@angular/core';
import { PeopleService } from './services/people.service';

@Component({ 
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  count = 0;
  nome = 'Daniel Ribeiro';
  text = '';

  pessoas = [
    {
      firstName: '',
      lastName: '',
      age: 30
    },
    
  ];

  constructor(private peopleService: PeopleService) {
    
  }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  }

  ngOnInit() {
    this.getPeople();
    let interval = setInterval(() => {
      this.count++;
      if(this.count === 10) {
        clearInterval(interval);
      }
    }, 1000);
    
  } 

  clicou(nome: string): void {
    console.log('Clicou em mim', nome)
  }
  getPeople(){
    this.peopleService.getPeople().subscribe(people => {
      this.pessoas = people;
  })
}


function ngOnInit() {
  throw new Error('Function not implemented.');
}

