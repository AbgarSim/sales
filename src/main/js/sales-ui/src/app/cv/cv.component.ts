import { Component, OnInit } from '@angular/core';
import { CV } from '../services/model/cv.model';
import { Location } from '../services/model/location.model';
import { NgForm } from '@angular/forms';
import { CvService } from '../services/cv.service';

@Component({
  selector: 'app-cv',
  templateUrl: './cv.component.html',
  styleUrls: ['./cv.component.css']
})
export class CVComponent implements OnInit {

  cv: CV;

  constructor(private cvService: CvService) { }

  ngOnInit() {
  }

  submitForm(form: NgForm) {
    var location : Location = {
        id: null,
        countryName: form.value.country,
        cityName: form.value.city
    }
    var cv : CV = {
      companyName: form.value.company,
      firstName: form.value.firstName,
      lastName: form.value.lastName,
      emailAddress: form.value.email,
      address: form.value.adress,
      location: location, 
      postalCode: form.value.postalCode,
      generalInfo: form.value.additionalInfo
    }

    console.log(cv);
    this.cvService.postCv(cv);
  }
}
