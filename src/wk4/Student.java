package wk4;

import java.util.Random;

public class Student {
    /*
        attributes
            name
            GPA
            grades: arrayList of double values
            age: int between 17-50
            student status: full-time or parttime, continuing education
       actions
            isHonorRoll: determine if GPA is 3.5+
            isMature: student of age 30+
     */
    public String name = "Ben";
    private float gpa; //between 0-4
    private int age = 17; //between 17-50

    public enum StudentStatus {FULL_TIME, PART_TIME, CONTINUING_EDUCATION}
    public StudentStatus status = StudentStatus.FULL_TIME;


//    public final int yearAcceptedToAttendSchool = 2024;
    public final int yearAcceptedToAttendSchool;
    public boolean isHonorRoll(){
        return gpa >= 3.5f;
    }
    public boolean isMatureStudent(){
        return age >= 30;
    }

    public Student(){
        yearAcceptedToAttendSchool = 2024;
    }

    public Student(String name, float gpa, int age, StudentStatus studentStatus){

        this.name = name;
        //this.gpa = gpa;
        //this.age = age;
        setAge(age);
        setGpa(gpa);
        this.status = studentStatus;
        yearAcceptedToAttendSchool = new Random().nextInt(2020, 2025);
    }

    public Student(String name, StudentStatus status) {
//        this.name = name;
//        this.status = status;
        this(name, 0f, 17, status);
    }

    public Student(String name, int age, StudentStatus status) {
//        this.name = name;
//        this.age = age;
//        this.status = status;
        this(name, 0f, age, status);
    }
    public Student(String name,  StudentStatus status, int age) {
        this(name, age, status);
    }

    //right-click and choose Generate


    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        if(gpa >= 0 && gpa <= 4)
            this.gpa = gpa;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 17 && age <= 50)
            this.age = age;
    }

    //method that generates a category of Student = factory method
    // returns an object of this class

    public static Student MatureFullTimeStudent(String name, int age){

        return new Student(name, 0f, age >= 30 ? age : 30, StudentStatus.FULL_TIME);
    }
}
