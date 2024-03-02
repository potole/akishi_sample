import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-disp2',
  templateUrl: './disp2.component.html',
  styleUrls: ['./disp2.component.css']
})
export class Disp2Component implements OnInit {
  apiUrl = environment.apiUrl;
  jsonData: any;

  constructor(private http: HttpClient) {}

  ngOnInit() {
  }

  getData() {
    this.http.get<any>(this.apiUrl + "/test6").subscribe(
      (data) => {
        // HTTPリクエストが成功した場合の処理
        this.jsonData = data;
        console.log("データを取得しました:", data);
        if(data.length == 0 ) {
          this.jsonData = null;
          alert("データを取得できませんでした。")
        }
      },
      (error) => {
        // HTTPリクエストが失敗した場合の処理
        console.error("データを取得できませんでした:", error);
        this.jsonData = null;
        alert("データを取得できませんでした。");
      }
    );
  }

  clearData() {
    this.jsonData = null;
  }
  

  getObjectKeys(obj: any): string[] {
    return Object.keys(obj);
  }

}
