import { Component, Input, OnChanges, SimpleChanges } from '@angular/core';


@Component ({
    selector: 'app-star',
    templateUrl: './star.component.html',
    styleUrls: ['./star.component.css']
})

export class StarComponent implements OnChanges {
    ngOnChanges(changes: SimpleChanges): void {
        throw new Error('Method not implemented.');
    }
    
    @Input()
    rating: number = 0;

    starWidth: number;

    ngOnchanges(): void {
        this.starWidth = this.rating * 94 / 5;
    }
}