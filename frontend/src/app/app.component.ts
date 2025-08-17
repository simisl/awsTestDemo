import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'frontend';
  message: any;

  constructor(private http: HttpClient){}

  callApi() {
    this.http.get('http://192.168.1.131:8080/api/health/page').subscribe((x:any)=>{
      console.log(x)
      this.message = x.message;
    })

  }
}
