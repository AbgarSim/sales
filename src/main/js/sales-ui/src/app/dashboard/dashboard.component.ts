import { Component, OnInit } from '@angular/core';
import * as Chartist from 'chartist';
import { CustomerService } from '../services/customer.service';
import { Customer } from '../services/model/customer.model';
import { ReportService } from '../services/report.service';
import { SaleService } from '../services/sale.service';
import { Sale } from '../services/model/sale.model';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {


  private negativeReports: number;
  private customerCount: number;
  private topCustomers: Customer[];
  private sales: Sale[];

  constructor(
    private customerService: CustomerService,
    private reportService: ReportService,
    private saleService: SaleService
  ) {
    customerService.getTopCustomers().subscribe(
      response => {
        this.topCustomers = response;
      }
    )

    reportService.getNegativeReportCount().subscribe(
      response => {
        this.negativeReports = response.count;
      }
    )

    reportService.getCustomerCount().subscribe(
      response => {
        this.customerCount = response.count;
      }
    )

    
  }


  ngOnInit() {

    this.saleService.getAllSales().subscribe(
      response => {
        this.sales = response;
        console.log(this.sales);
        this.drawChart();
      }
    )

    
    // var salesProfit = new Array(this.sales.length);
    // for(var i = 0; i<this.sales.length; i++){
    //   salesProfit[i] = this.sales[i].profit;
    // }
    // console.log(this.sales);
    
  }

  drawChart(){
    var test = new Array(this.sales.length).join( '' );;
    const dataDailySalesChart: any = {
      labels: test,
      series: [
        this.sales.map(e => e.profit)
      ]
    };

    const optionsDailySalesChart: any = {
      lineSmooth: Chartist.Interpolation.cardinal({
        tension: 0
      }),
      low: 0,
      high: 4000,
      chartPadding: { top: 0, right: 0, bottom: 0, left: 0 },
    }
    var dailySalesChart = new Chartist.Line('#dailySalesChart', dataDailySalesChart, optionsDailySalesChart);

    this.startAnimationForLineChart(dailySalesChart);
  }

  startAnimationForLineChart(chart) {
    let seq: any, delays: any, durations: any;
    seq = 0;
    delays = 80;
    durations = 500;

    chart.on('draw', function (data) {
      if (data.type === 'line' || data.type === 'area') {
        data.element.animate({
          d: {
            begin: 600,
            dur: 700,
            from: data.path.clone().scale(1, 0).translate(0, data.chartRect.height()).stringify(),
            to: data.path.clone().stringify(),
            easing: Chartist.Svg.Easing.easeOutQuint
          }
        });
      }
    });

    seq = 0;
  };

}
