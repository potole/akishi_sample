import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = "タイトル";
  titleChg1:string = "たいとる"
  titleChg2:string = "タイトル"

  ChgTitle() {
    if(this.title == this.titleChg1){
      this.title = this.titleChg2;
    }else{
      this.title = this.titleChg1;
    }
    
  }

}




