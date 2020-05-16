import { Injectable } from '@angular/core';
import { HttpService } from './http.service';
import { HttpClient } from '@angular/common/http';
import { Employee } from './model/employee.model';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService extends HttpService {

    
  constructor(private httpClient: HttpClient) {
    super();
  }

  getAllManagerEmployees(){
    return this.httpClient.get<Employee[]>(this.API_URL + "/employee?position=Manager");
  }
}
