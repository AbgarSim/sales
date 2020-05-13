import { Component, OnInit } from '@angular/core';

declare const google: any;

@Component({
  selector: 'app-maps',
  templateUrl: './maps.component.html',
  styleUrls: ['./maps.component.css']
})
export class MapsComponent implements OnInit {

  alreadyLoaded : boolean;

  constructor() {
    this.alreadyLoaded = false;
   }

  ngOnInit() {
      this.loadMapOnce();
  }

  loadMapOnce() {
    if(this.alreadyLoaded)
        return;

    var center = new google.maps.LatLng(47.0240227,28.8293724);
    var mapOptions = {
        zoom: 14.25,
        center: center,
        scrollwheel: true, 
        styles: [{
            "featureType": "water",
            "stylers": [{
                "saturation": 43
            }, {
                "lightness": -11
            }, {
                "hue": "#0088ff"
            }]
        }, {
            "featureType": "road",
            "elementType": "geometry.fill",
            "stylers": [{
                "hue": "#ff0000"
            }, {
                "saturation": -100
            }, {
                "lightness": 99
            }]
        }, {
            "featureType": "road",
            "elementType": "geometry.stroke",
            "stylers": [{
                "color": "#808080"
            }, {
                "lightness": 54
            }]
        }, {
            "featureType": "landscape.man_made",
            "elementType": "geometry.fill",
            "stylers": [{
                "color": "#ece2d9"
            }]
        }, {
            "featureType": "poi.park",
            "elementType": "geometry.fill",
            "stylers": [{
                "color": "#ccdca1"
            }]
        }, {
            "featureType": "road",
            "elementType": "labels.text.fill",
            "stylers": [{
                "color": "#767676"
            }]
        }, {
            "featureType": "road",
            "elementType": "labels.text.stroke",
            "stylers": [{
                "color": "#ffffff"
            }]
        }, {
            "featureType": "poi",
            "stylers": [{
                "visibility": "off"
            }]
        }, {
            "featureType": "landscape.natural",
            "elementType": "geometry.fill",
            "stylers": [{
                "visibility": "on"
            }, {
                "color": "#b8cb93"
            }]
        }, {
            "featureType": "poi.park",
            "stylers": [{
                "visibility": "on"
            }]
        }, {
            "featureType": "poi.sports_complex",
            "stylers": [{
                "visibility": "on"
            }]
        }, {
            "featureType": "poi.medical",
            "stylers": [{
                "visibility": "on"
            }]
        }, {
            "featureType": "poi.business",
            "stylers": [{
                "visibility": "simplified"
            }]
        }]

    };
    var map = new google.maps.Map(document.getElementById("map"), mapOptions);

    var loc1 = new google.maps.LatLng(47.0189428,28.8222972)
    var marker1 = new google.maps.Marker({
        position: loc1,
        title: "Location 1"
    });

    var loc2 = new google.maps.LatLng(47.0304577,28.8359442)
    var marker2 = new google.maps.Marker({
        position: loc2,
        title: "Location 2"
    });

    var loc3 = new google.maps.LatLng(47.0233645,28.8357767)
    var marker3 = new google.maps.Marker({
        position: loc3,
        title: "Location 3"
    });

    marker1.setMap(map);
    marker2.setMap(map);
    marker3.setMap(map);
  }
}
