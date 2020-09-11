package learning.java.school.model;

public class Group {
    private Professor professor;
    private int availability;
    private int Enrolled;
    private Student[] students;

    public Group(int availability) {
        Enrolled = 0;
        this.availability = availability;
        students = new Student[availability];
    }

    public Group(int availability, Professor professor) {
        this.availability = availability;
        this.professor = professor;
        students = new Student[availability];
        Enrolled = 0;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void printStudentsList() {
        for (int i = 0; i < Enrolled; i++) {
            System.out.println(students[i].getName());
        }
    }

    public int getEnrolled(){return Enrolled;}

    public int getAvailability(){return  availability;}

    public void addStudent(Student student){
        if(Enrolled<= availability){
            students[Enrolled] = new Student(student.getName(),student.getCode());
            Enrolled++;
        }
    }

    public void setProfessor(Professor professor){ this.professor =professor; }
}