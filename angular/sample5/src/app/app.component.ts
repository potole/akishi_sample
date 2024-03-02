import { Component, OnInit } from '@angular/core';
import { Socket } from 'ngx-socket-io';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  messages: any[] = [];
  name: string;
  messageText: string;

  constructor(private socket: Socket) {}

  ngOnInit() {
    this.socket.on('connect', () => {
      console.log('Connected to server');
    });

    this.socket.on('message', (message) => {
      this.messages.push(message);
    });
  }

  sendMessage() {
    if (this.name && this.messageText) { 
      this.socket.emit('message', {
        user: this.name,
        text: this.messageText
      });
      this.messageText = '';
    }
  }
}
