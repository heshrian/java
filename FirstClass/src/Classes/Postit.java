package Classes;

public class Postit {
    String backgroundColour;
    String text;
    String textColour;

    public Postit(){

    }

    public void info(){
        System.out.println("Background colour is "+ backgroundColour);
        System.out.println("Text on postit is "+text);
        System.out.println("Text colour is "+textColour);
    }
}
