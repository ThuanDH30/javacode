/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo1;

/**
 *
 * @author Bravo
 */
public class Animal {
    private String name;
    private int age;
    private double weight;
    private double height;
    
    public void eat(){
        
    }
    public void converInfo(){
        
    }

    public Animal(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name =name;
    }
    public Animal(){
      
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
    
    public static void main(String[] args) {
        Animal a1=new Animal(18,60,80);
        Animal a2=new Animal();
        System.out.println(a1);
        System.out.println(a2);
    }

    @Override
    public String toString() {
        return "Animal{" + "age=" + age + ", weight=" + weight + ", height=" + height + '}';
    }
    
}
