package PrototypeAndRegistry;

public class GeniusStudent extends Student{

    private int iq;
    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }



    public Student clone(){
        GeniusStudent student = new GeniusStudent();
        student.iq = this.iq;
        return student;
    }
}
