import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { environment } from 'src/environments/environment';

@Component({
  selector: 'app-disp1',
  templateUrl: './disp1.component.html',
  styleUrls: ['./disp1.component.css']
})
export class Disp1Component implements OnInit {
  jsonData: any;
  inputNo:string = "";
  apiUrl = environment.apiUrl;

  constructor(private http: HttpClient) {}

  ngOnInit() {
  }

  getData() {
    if (!this.inputNo) {
      alert("番号を入力してください。")
      return;
    }
    this.http.get<any>(this.apiUrl + "/test8?kojin_no=" + this.inputNo).subscribe(
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
        // エラーメッセージをユーザーに通知するなど、適切なエラーハンドリングを行う
        this.jsonData = null;
        alert("データを取得できませんでした。");
      }
    );
    
  }

  clearData() {
    this.jsonData = null;
  }
  

  getObjectKeys(obj: any): string[] {
    if (obj) {
      return Object.keys(obj);
    } else {
      return [];
    }
  }

}
