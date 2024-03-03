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

