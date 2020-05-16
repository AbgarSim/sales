import { Injectable } from '@angular/core';
import { HttpService } from './http.service';
import { HttpClient } from '@angular/common/http';
import { GeneralInfo } from './model/generalinfo.model';

@Injectable({
  providedIn: 'root'
})
export class MainPageService extends HttpService{

  constructor(private httpClient: HttpClient) {
    super();
  }

  getMainPageInfo(){
    return this.httpClient.get<GeneralInfo>(this.API_URL + "/gen-info");
  }
}
