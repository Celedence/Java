public class Short extends Shirt {

    private String style;

    public Short(String light) {
        super(true);
        this.style = light;
    }

    public String getStyle() {
        System.out.println("This style is " + style);
        return style;
    }
    
}
