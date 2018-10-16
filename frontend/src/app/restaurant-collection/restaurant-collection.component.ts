import { Component, OnInit, AfterContentInit } from '@angular/core';
import { ApiSpringService } from '../api-spring.service';

@Component({
  selector: 'app-restaurant-collection',
  templateUrl: './restaurant-collection.component.html',
  styleUrls: ['./restaurant-collection.component.scss']
})
export class RestaurantCollectionComponent implements OnInit {


  listRestaurant: any;
  constructor(private Api: ApiSpringService) {

   }

  ngOnInit() {
    this.Api.getListRestaurant().subscribe(data => {
      this.listRestaurant = data;
    });
  }


}
