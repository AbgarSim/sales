import { Component, OnInit } from '@angular/core';
import { BlogService } from '../services/blog.service';
import { BlogPost } from '../services/model/blogpost.model';

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.css']
})
export class BlogComponent implements OnInit {

  blogPosts : BlogPost[];

  constructor(private blogService : BlogService) { }

  ngOnInit() {
    this.blogService.getAllBlogPosts().subscribe(
      response => {
        this.blogPosts = response;
      }
    );
  }

}
