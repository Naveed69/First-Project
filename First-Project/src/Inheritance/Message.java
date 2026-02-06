package src.Inheritance;

public class Message {
    private String sender;
    private String reciver;
    private String content;
    public Message(String sender,String reciver, String content){
        this.sender=sender;
        this.reciver=reciver;
        this.content=content;
    }

    public String getSender(){
        return sender;
    }
}
