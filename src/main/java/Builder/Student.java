package Builder;

public class Student {
    private int id;
    private String name;
    private String batchName;
    private int age;
    private int gradYear;
    private double psp;
    private String phoneNumber;

    public static Builder builder(){
        return new Builder();
    }

    //this is private method because no body can call the constructor directly for that they need to go through builder
    private Student (Builder builder) {

        this.id = builder.id;
        this.name = builder.name;
        this.batchName = builder.batchName;
        this.age = builder.age;
        this.gradYear = builder.gradYear;
        this.psp = builder.psp;
        this.phoneNumber = builder.phoneNumber;
    }




    
    // This below class is called the builder class
    // Builder class contains only setters each setter returns "this;"
    public static class Builder {
        private int id;
        private String name;
        private String batchName;
        private int age;
        private int gradYear;
        private double psp;
        private String phoneNumber;

        public Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }



        public Builder name(String name) {
            this.name = name;
            return this;
        }



        public Builder batchName(String batchName) {
            this.batchName = batchName;
            return this;
        }



        public Builder age(int age) {
            this.age = age;
            return this;
        }


        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }



        public Builder psp(double psp) {
            this.psp = psp;
            return this;
        }



        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        private  void Validate(Builder builder){
            if(builder.age<20){
                throw new InvalidAgeException("Age cant be less than 20");
            }

            if(builder.gradYear>2024){
                throw new InvalidGradYearException("Grad Year cant bemore than 2024");
            }
        }
        // this below method validates before creating object
        // this method is public because this will be called from outside
        public  Student build(){
        Validate(this);
        return new Student(this);
    }
}
}
