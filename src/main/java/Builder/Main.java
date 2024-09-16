package Builder;

public class Main {
    public static void main(String[] args) {


        Student studentobj1 = Student.builder().id(1)
                .psp(100)
                .phoneNumber("12345678")
                .name("Builder")
                .batchName("Scale")
                .gradYear(2023)
                .age(21)
                .build();
        System.out.println(studentobj1);

        // Problems which builder pattern solve:
        /*
          1. Readability is still not better
          2. 2 extra objects --> Student Helper, Student when validation fails
            extra object is created no matter validation fails or passes
          3. Student Helper is outside of student
        */
    }
}
