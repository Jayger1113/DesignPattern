package behavioural.mediator;

//Colleague Class
public abstract class User {
    private ChatRoomOperation mediator;

    private String id;
    private String name;

    public User(ChatRoomOperation room, String id, String name) {
        this.mediator = room;
        this.name = name;
        this.id = id;
    }

    public abstract void send(String msg, String userId);

    public abstract void receive(String msg);

    public ChatRoomOperation getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}