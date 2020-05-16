import { Injectable } from '@angular/core';
import { HttpService } from './http.service';
import { OfficeLocation } from './model/officelocation.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class OfficeService extends HttpService {

  constructor(private httpClient: HttpClient) {
    super();
  }
  
  getAllOfficeLocations(){
    return this.httpClient.get<OfficeLocation[]>(this.API_URL + "/offices");
  }
}
