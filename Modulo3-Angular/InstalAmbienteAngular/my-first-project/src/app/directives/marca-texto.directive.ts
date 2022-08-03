import { Directive, ElementRef, Input, OnInit } from '@angular/core';

@Directive({
  selector: '[appMarcaTexto]'
})
export class MarcaTextoDirective implements OnInit{
  @Input() corDefundo: string = '#yellow';
  @Input() corLetra: string = '#white';

  constructor(private elemento: ElementRef) { }
  ngOnInit(){
    this.mudarFundo();
  }

  private mudarFundo(cor: string = 'yellow'){
    this.elemento.nativeElement.style.backgroundColor = this.corDefundo || cor;
    this.elemento.nativeElement.style.color = this.corLetra;
    this.elemento.nativeElement.style.fontWeight = 'bold';
  }



}
