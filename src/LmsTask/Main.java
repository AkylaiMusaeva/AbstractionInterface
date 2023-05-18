package LmsTask;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EducationCenter university=new University("KGUSTA","Bishkek",LocalDate.of(1996,12,2));
        EducationCenter college=new College("Finteh","Bishkek",LocalDate.of(1999,4,26));
        EducationCenter school=new School("72-ая школа ","Bishkek",LocalDate.of(2000,10,26));

        Student student1=new Student("Akylai","Musaeva",'F',LocalDate.of(2019,9,1),university);
        Student student2=new Student("Eldan","Turgunbaev",'M',LocalDate.of(2020,8,30),college);
        Student student3=new Student("Aliya","Ajybaeva",'F',LocalDate.of(2016,5,23),school);
        Student []students={student1,student2,student3};
        Main.getAllStudentInfo(students);
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        for (Student s:students) {
            s.getStudentsEducationCenter();
            s.getStudentsStudyingYear();
        }
    }
    public static void getAllStudentInfo(Student []students) {
        for (Student s : students) {
            System.out.println(s);
        }

    }
}
