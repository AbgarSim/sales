import { Component, OnInit } from "@angular/core";
import { BlogService } from '../services/blog.service';
import { BlogPost } from '../services/model/blogpost.model';
import { MainPageService } from '../services/mainpage.service';
import { GeneralInfo } from '../services/model/generalinfo.model';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {

  private generalInfo: GeneralInfo;
  private mainPagePost: BlogPost;

  constructor(
    private blogService: BlogService,
    private generalInfoService: MainPageService
  ) { }

  ngOnInit() {
    this.blogService.getMainPagePost().subscribe(
      response => {
        this.mainPagePost = response;
      }
    )

    this.generalInfoService.getMainPageInfo().subscribe(
      response => {
        this.generalInfo = response;
      }
    )
  }

}  