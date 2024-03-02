import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  jsonHeaders: string[] = ['id', 'name', 'age']; 
  jsonData:testData[] = [];
  newData:any = { id: '', name: '', age: '' };

  ngOnInit(): void {
    this.jsonData = [
      { id: 1, name: 'エロ　太郎', age: 55 },
      { id: 2, name: 'すけ　花子', age: 30 },
      { id: 3, name: 'ペテルギウス　ロマネコンティ', age: 402 }
    ];
  }

  addData(): void{
    const newDataCopy: testData = { id: this.newData.id, name: this.newData.name, age: this.newData.age };
    this.jsonData.push(newDataCopy);
  }

}

//データクラス
export class testData{
  id:number;
  name:string;
  age:number;
}
