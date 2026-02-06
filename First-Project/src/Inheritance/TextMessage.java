package src.Inheritance;

public class TextMessage extends Message{
    private boolean isRead;
    public TextMessage(String sender,String reciver, String content,boolean isRead){
        super(sender,reciver,content);
        this.isRead=isRead;
    }

    public boolean getIsRead(){
        return isRead;
    }
}
