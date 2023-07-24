import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Property } from '../../model/property';

@Component({
  selector: 'app-property-list',
  templateUrl: './property-list.component.html',
  styleUrls: ['./property-list.component.css']
})
export class PropertyListComponent implements OnInit {
  properties: Property[] = [];
  propertyForm!: FormGroup;
  searchForm!: FormGroup;
  constructor() {
    //write your logic here
  }
  ngOnInit(): void {
    //write your logic here
  }
  createProperty(): void {
    //write your logic here
  }
  getProperties(): void {
    //write your logic here
  }
  getProperty(id: number): void {
    //write your logic here
  }
  updateProperty(property: Property): void {
    //write your logic here
  }
  deleteProperty(id: number): void {
    //write your logic here
  }
  searchProperties() {
    //write your logic here
  }

}
