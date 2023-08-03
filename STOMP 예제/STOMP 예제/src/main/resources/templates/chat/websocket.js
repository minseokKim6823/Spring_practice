// websocket.js

// 웹 소켓 연결을 수립하는 함수
/*function connectWebSocket(roomId, sender) {
  const socket = new SockJS('/ws/chat'); // 웹 소켓 연결을 수립할 주소
  const stompClient = Stomp.over(socket);

  stompClient.connect({}, function (frame) {
    // 연결에 성공했을 때 실행되는 콜백 함수
    console.log('Connected: ' + frame);

    // 메시지를 전송하는 함수
    function sendMessage(message) {
      stompClient.send('/app/chat/message', {}, JSON.stringify({
        type: 'TALK',
        roomId: roomId,
        sender: sender,
        message: message
      }));
    }

    // 웹 소켓을 통해 새로운 메시지를 받았을 때 실행되는 콜백 함수
    stompClient.subscribe('/topic/chat/room/' + roomId, function (message) {
      const recv = JSON.parse(message.body);
      // 받은 메시지를 처리하는 로직을 여기에 작성합니다.
      console.log(recv);
    });

    // 웹 소켓을 통해 입장 메시지를 전송합니다.
    stompClient.send('/app/chat/message', {}, JSON.stringify({
      type: 'ENTER',
      roomId: roomId,
      sender: sender,
      message: sender + '님이 입장하였습니다.'
    }));
  }, function (error) {
    // 연결에 실패하거나 오류가 발생했을 때 실행되는 콜백 함수
    console.error('Error during WebSocket connection:', error);
  });
}
*/