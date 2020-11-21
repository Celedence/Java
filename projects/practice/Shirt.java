

public class Shirt {

    private boolean isCotton;
    private String color;

    public Shirt(boolean isCotton) {
        this.isCotton = isCotton;
    }

    public String baseColor(String white) {
        System.out.println("The base color is " + white);
        return color;
    }

    public boolean soft() {
        System.out.println("soft is called");
        return isCotton;
    }


    
}
