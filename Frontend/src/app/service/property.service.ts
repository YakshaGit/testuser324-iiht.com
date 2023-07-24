import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { Property } from "../model/property";

@Injectable({
  providedIn: "root",
})
export class PropertyService {
  apiUrl = "";
  constructor(private http: HttpClient) {}

  getAllProperties() {
    //write your logic here
  }

  getPropertyById(id: number) {
    //write your logic here
  }

  createProperty(property: Property) {
    //write your logic here
  }

  updateProperty(property: Property) {
    //write your logic here
  }

  deleteProperty(id: number) {
    //write your logic here
  }

  searchProperties(queryParams: any) {
    //write your logic here
  }

  searchPropertiesByName(name: String): any {
    //write your logic here
  }

  searchPropertiesByPrice(price: Number): any {
    //write your logic here
  }

  searchPropertiesByCategory(category: String): any {
    //write your logic here
  }
}
