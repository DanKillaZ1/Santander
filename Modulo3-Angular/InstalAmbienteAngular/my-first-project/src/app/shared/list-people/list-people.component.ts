import { Component, OnInit } from '@angular/core';
import { PeopleService } from './services/people.service';

@Component({
  selector: 'app-list-people',
  templateUrl: './list-people.component.html',
  styleUrls: ['./list-people.component.css']
})
export class ListPeopleComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
