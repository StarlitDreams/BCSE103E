/*
 Write a Java Program to implement the students details using multiple inheritance.

 Student (Class)

   ||

 Test  (Class)

  ||

Sports (Interface)

   ||

Result => Test and Sports

||

Main Class 

Include all the necessary methods and data members to implement the student details.
 */

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}


class Test extends Student {
    double mathsMark;
    double englishMark;

    Test(String name, int rollNo, double mathsMark, double englishMark) {
        super(name, rollNo);
        this.mathsMark = mathsMark;
        this.englishMark = englishMark;
    }

    void displayTestMarks() {
        System.out.println("Maths Mark: " + mathsMark);
        System.out.println("English Mark: " + englishMark);
    }
}


interface Sports {
    double sportMark = 50.0; 

    void displaySportMark();
}


class Result extends Test implements Sports {
    Result(String name, int rollNo, double mathsMark, double englishMark) {
        super(name, rollNo, mathsMark, englishMark);
    }

    @Override
    public void displaySportMark() {
        System.out.println("Sports Mark: " + sportMark);
    }

    void displayTotalMark() {
        double total = mathsMark + englishMark + sportMark;
        System.out.println("Total Mark: " + total);
    }
}


public class StudentDetails {
    public static void main(String[] args) {
        Result studentResult = new Result("Jignesh", 5639, 56.9, 99.9);
        studentResult.displayStudentDetails();
        studentResult.displayTestMarks();
        studentResult.displaySportMark();
        studentResult.displayTotalMark();
    }
}
