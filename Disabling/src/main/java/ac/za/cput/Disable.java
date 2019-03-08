package ac.za.cput;

public class Disable {

    private String name;

    public Disable(String message){
        this.name = message;
    }

    public String viewProdName(){
        System.out.println(name);
        return name;
    }

    public String displayProdName(){
        name = "Price of " + name;
        System.out.println(name);
        return name;
    }
}
