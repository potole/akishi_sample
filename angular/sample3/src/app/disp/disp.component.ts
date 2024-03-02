import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-disp',
  templateUrl: './disp.component.html',
  styleUrls: ['./disp.component.css']
})
export class DispComponent implements OnInit {
  jsonData: any;

  constructor(private http: HttpClient) {}

  ngOnInit() {
  }

  getData() {
    this.http.get<any>("http://localhost:3000/data").subscribe(data => {
      this.jsonData = data;
    });
  }

  clearData() {
    this.jsonData = null;
  }
  

  getObjectKeys(obj: any): string[] {
    return Object.keys(obj);
  }

}
