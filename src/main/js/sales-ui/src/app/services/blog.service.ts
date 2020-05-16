import { Injectable } from '@angular/core';
import { HttpService } from './http.service';
import { BlogPost } from './model/blogpost.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BlogService extends HttpService {
  
  
  constructor(private httpClient: HttpClient) {
    super();
  }

  getMainPagePost(){
    return this.httpClient.get<BlogPost>(this.API_URL + "/blog/main-post");
  } 
  
  getAllBlogPosts() {
    return this.httpClient.get<BlogPost[]>(this.API_URL + "/blog/posts");
  }
}
