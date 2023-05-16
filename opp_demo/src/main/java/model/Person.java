package model;
import java.util.Scanner;
class Person {
    private int age;
    private String name;
    private String address;
    double weight;
    double height;
    boolean GT;
    int idCard;

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }
    private String birthday;

    public int getAge() {
        return age;
    }

    public void setAge(int age ){
     if(age<18 || age >50){
            System.out.println("tuoi cua ban phai lon hon 18 va be hon 50");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isGT() {
        return GT;
    }

    public void setGT(boolean GT) {
        this.GT = GT;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
    
    public void play(){
        System.out.println("di danh bida");
    }
    public void eat(){
        System.out.println("an toi");
    }
    public void sleep(){
        System.out.println("di ngu thoi");
    }
    public void code(){
        System.out.println("code dao");
    }

    public Person(int age, String name, String address, double weight, double height, boolean GT, int idCard, String birthday) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.weight = weight;
        this.height = height;
        this.GT = GT;
        this.idCard = idCard;
        this.birthday = birthday;
    }
   public Person(){
       
   };

    @Override
    public String toString() {
        return "Name :"+name+"age :"+age;
    }
     
    public static void main(String[] args) {
        Person con_1 =new Person();
        System.out.println("age :"+con_1.age);
        System.out.println("name :"+con_1.name);
        System.out.println("address :"+con_1.address);
        System.out.println("weight :"+con_1.weight);
        System.out.println("height :"+con_1.height);
        System.out.println("birthday :"+con_1.birthday);
        con_1.name="thuan thien";
        System.out.println("ten sau khi thay doi :"+ con_1.name);
        con_1.GT=false;
        if(con_1.GT==false){
            System.out.println("Gender: Female");
        }else{
            System.out.println("gender: male");
        }
        con_1.age+=18;
        con_1.weight=48;
        con_1.height= 1.7;
        System.out.println("age sau khi day thi :"+con_1.age);
        System.out.println("weight sau khi day thi :"+con_1.weight);
        System.out.println("height sau khi day thi :"+con_1.height);
        con_1.play();
        con_1.sleep();
        con_1.code();
        con_1.eat();;
    }
}
