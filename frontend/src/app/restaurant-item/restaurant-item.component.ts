import { Component, OnInit, Input, AfterContentInit } from '@angular/core';

@Component({
  selector: 'app-restaurant-item',
  templateUrl: './restaurant-item.component.html',
  styleUrls: ['./restaurant-item.component.scss']
})
export class RestaurantItemComponent implements OnInit, AfterContentInit {

  @Input() resturant;
  quality_test: any;
  constructor() {}

  ngOnInit() {
  }

  ngAfterContentInit(): void {
    console.log(this.resturant);
  }

}
