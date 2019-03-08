package ac.za.cput;

public class Timeout {

    private String text;

    public Timeout(String message){
        this.text = message;
    }

    public void printMessage(){
        System.out.println(text);
        while(true);
    }

    public String textMessage(){
        text = "Say" + text;
        System.out.println(text);
        return text;
    }
}
