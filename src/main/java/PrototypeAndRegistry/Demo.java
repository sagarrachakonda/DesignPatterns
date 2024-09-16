package PrototypeAndRegistry;

public class Demo {
    public static void main(String[] args) {

        Student originalObj = new Student();
        //originalObj.setBatchName("Scaler");
        originalObj.setId(1);
        originalObj.setPsp(90);
        originalObj.setName("Kumar");

        Student copy = originalObj.Clone();


         StudentRegistry registry = new StudentRegistry();
         //Student aprbatch = new Student();
         copy.setBatchName("April 2024 Batch");
         registry.set("April 2024",copy);
    }
}
