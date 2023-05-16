package model;
public class GiaoVien extends Person{
    private int numberCourses;

    public GiaoVien(int age, String name, String address, double weight, double height, boolean GT, int idCard, String birthday,int n) {
        super(age, name, address, weight, height, GT, idCard, birthday);
        this.numberCourses =n; 
    }
    public GiaoVien(){
        
    }
    public static void main(String[] args) {
        GiaoVien gv_1= new GiaoVien();
    }

    @Override
    public String toString() {
        return  
    }
    
}