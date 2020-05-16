import { Injectable } from '@angular/core';
import { HttpService } from './http.service';
import { HttpClient } from '@angular/common/http';
import { CV } from './model/cv.model';

@Injectable({
  providedIn: 'root'
})
export class CvService extends HttpService {

  constructor(private httpClient: HttpClient) {
    super();
  }

  postCv(cv: CV){
    this.httpClient.post<CV>(this.API_URL + "/cv", cv).subscribe();
  }
}
