class Student{
    int rollno;
    String name;
    int marks;
}

public class Demo {
    public static void main(String a[]) {
        Student students[] = new Student[3];

        Student s1 = new Student();
        s1.name = "John";
        s1.rollno = 1;
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Doe";
        s2.rollno = 2;
        s2.marks = 80;

        Student s3 = new Student();
        s3.name = "Smith";
        s3.rollno = 3;
        s3.marks = 75;

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        System.out.println(students[0].name + ": " + students[0].marks);
    }
}
