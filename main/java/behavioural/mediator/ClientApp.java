package behavioural.mediator;


public class ClientApp {

    public static void main(String[] args){
        ChatRoomOperation chatRoomOperation = new ChatRoom();

        User gary = new ChatUser(chatRoomOperation,"1", "Gary");
        User taylor = new ChatUser(chatRoomOperation,"2", "Taylor");
        User sam = new ChatUser(chatRoomOperation,"3", "Sam");
        User tom = new ChatUser(chatRoomOperation,"4", "Tom");

        chatRoomOperation.addUser(gary);
        chatRoomOperation.addUser(taylor);
        chatRoomOperation.addUser(sam);
        chatRoomOperation.addUser(tom);

        gary.send("Hello!!", "2");
        taylor.send("Hey!!", "1");
    }
}
