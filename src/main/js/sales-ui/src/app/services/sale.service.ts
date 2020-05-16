import { Injectable } from '@angular/core';
import { HttpService } from './http.service';
import { HttpClient } from '@angular/common/http';
import { Sale } from './model/sale.model';

@Injectable({
  providedIn: 'root'
})
export class SaleService extends HttpService {

  constructor(private httpClient: HttpClient) {
    super();
  }

  getAllSales(){
    return this.httpClient.get<Sale[]>(this.API_URL + "/sales")
  }
}
