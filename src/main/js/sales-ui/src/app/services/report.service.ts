import { Injectable } from '@angular/core';
import { HttpService } from './http.service';
import { HttpClient } from '@angular/common/http';
import { Count } from './model/count.model';

@Injectable({
  providedIn: 'root'
})
export class ReportService extends HttpService {

  constructor(private httpClient: HttpClient) {
    super();
  }

  getNegativeReportCount() {
    return this.httpClient.get<Count>(this.API_URL + "/reports/negative")
  }

  getCustomerCount() {
    return this.httpClient.get<Count>(this.API_URL + "/customers/count")
  }
}
