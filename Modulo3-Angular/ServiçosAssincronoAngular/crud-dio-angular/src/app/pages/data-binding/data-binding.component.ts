import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {
  text = 'Daniel ribeiro';
  imageUrl = 'https://picsum.photos/200/300';
  imageDesc = 'Essa e uma imagem';
  buttonText = 'Clique aqui';
  textRed = 'textred'; 
  bgColor = 'green';
  fontSize = '20px';
  widthImg = 600;
  textInput = '';  // Evento de entrada de dados two-way data binding



  constructor() { }

  ngOnInit(): void {
  }

  retornaNome(){
    return this.text
  }

  clicou(value: any ){
    this.text = 'DanKillaz';
    console.log('Clicou', value);
    this.textRed = false;
  }

}
