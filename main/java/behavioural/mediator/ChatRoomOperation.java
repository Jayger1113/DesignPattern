package behavioural.mediator;

//Mediator Interface
public interface ChatRoomOperation {
    void sendMessage(String msg, String userId);

    void addUser(User user);
}