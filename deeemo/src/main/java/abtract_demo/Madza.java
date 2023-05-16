package abtract_demo;

public class Madza implements Car {

    @Override
    public void run() {
        System.out.println("chay xe bang cach bam remote");
    }

    @Override
    public void turn0noflight() {
        System.out.println("bat den bang nut on,tat den bawng nut off");
    }
    public static void main(String[] args) {
        Madza m1=new Madza();
        m1.run();
        m1.turn0noflight();
    }
    
}
