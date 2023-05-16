package demo1;
public class KhiMe {
     String color;
     String coloereyes;

    public KhiMe(String color, String coloereyes) {
        this.color = color;
        this.coloereyes = coloereyes;
    }
    public KhiMe(){
        color="yelow";
        coloereyes="den";
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColoereyes() {
        return coloereyes;
    }

    public void setColoereyes(String coloereyes) {
        this.coloereyes = coloereyes;
    }
   
}
