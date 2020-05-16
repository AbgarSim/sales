import { Injectable } from '@angular/core';
import { HttpService } from './http.service';
import { HttpClient } from '@angular/common/http';
import { Customer } from './model/customer.model';

@Injectable({
  providedIn: 'root'
})
export class CustomerService extends HttpService {

  constructor(private httpClient: HttpClient) {
    super();
  }

  getTopCustomers(){
    return this.httpClient.get<Customer[]>(this.API_URL + "/customers/top-sales");
  }
}
