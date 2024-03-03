import { AfterViewChecked, Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { Socket } from 'ngx-socket-io';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit, AfterViewChecked {

  @ViewChild('messagesContainer') private messagesContainer: ElementRef;

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

  ngAfterViewChecked() {
    this.scrollToBottom();
  }

  onEnterKeyDown(event: KeyboardEvent): void {
    if (event.shiftKey) {
      return;
    }
  
    event.preventDefault(); // デフォルトのEnterキーの動作をキャンセル
    this.sendMessage(); 
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
  
  scrollToBottom(): void {
    try {
      this.messagesContainer.nativeElement.scrollTop = this.messagesContainer.nativeElement.scrollHeight;
    } catch(err) { }
  }
  
}

