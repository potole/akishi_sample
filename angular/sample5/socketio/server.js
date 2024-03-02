// var app = require('express')();
// var server = require('http').Server(app);
// var io = require('socket.io')(server);

// server.listen(3000);

// io.on('connection', function (socket) {
//   console.log('a user connected');

//   socket.on('message', function (message) {
//     io.emit('message', message);
//   });

//   socket.on('disconnect', function () {
//     console.log('a user disconnected');
//   });
// });

// var socketIo = require('socket.io');

// var io = socketIo(3000);

// io.on('connection', (socket) => {
//   console.log('A user connected');

//   socket.on('message', (message) => {
//     io.emit('message', message);
//   });

//   socket.on('disconnect', () => {
//     console.log('A user disconnected');
//   });
// });

var socketIo = require('socket.io');

var io = socketIo(3000);

io.on('connection', (socket) => {
  console.log('A user connected');

  // クライアントが接続したときに一意のIDを割り当てる
  const userId = socket.id;

  socket.on('message', (message) => {
    // メッセージに送信元のユーザーIDを追加する
    message.userId = userId;
    // 送信元を含めて他のクライアントにメッセージを送信する
    io.emit('message', message);
  });

  socket.on('disconnect', () => {
    console.log('A user disconnected');
  });
});

