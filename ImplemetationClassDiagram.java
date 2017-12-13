package implemetationclassdiagram;

public class ImplemetationClassDiagram {
    
    public static void main(String[] args) {
        ImplemetationClassDiagram hej = new ImplemetationClassDiagram();
        hej.go();
    }

    private void go() {
        Teacher teacher1 = new Teacher("Jakob");
        Teacher teacher2 = new Teacher("Fredrik");
        Teacher teacher3 = new Teacher("Dante");
        
        Student student1 = new Student("Sasan");
        Student student2 = new Student("Jonas");
        Student student3 = new Student("Oscar");
        
        Program prog = new Program("Java17");
        ProgramCoordinator progCoor = new ProgramCoordinator("Oliver", teacher1);
        prog.setProgramCoordinator(progCoor);
        progCoor.setProgram(prog);
        
        progCoor.addTeacher(teacher2);
        progCoor.addTeacher(teacher3);
        
        Seminar seminar = new Seminar("Lektion  5", teacher1, prog);
        teacher1.setCurrentSeminar(seminar);
        prog.addToSeminars(seminar);
        
        Subject sub1 = new Subject("Strömmar", seminar);
        Subject sub2 = new Subject("Listor", seminar);
        seminar.addToSubjects(sub1);
        seminar.addToSubjects(sub2);
        
        Attendance attendance1 = new Attendance(seminar, student1);
        Attendance attendance2 = new Attendance(seminar, student2);
        Attendance attendance3 = new Attendance(seminar, student3);
        
        student1.addToAttendance(attendance1);
        student2.addToAttendance(attendance2);
        student3.addToAttendance(attendance3);
        
        seminar.addAttendance(attendance1);
        seminar.addAttendance(attendance2);
        seminar.addAttendance(attendance3);

        prog.getStudents().forEach(student -> System.out.println(student));
        
        student1.attendSeminar(attendance1);
        student1.getSeminarsAttended().forEach(x -> System.out.println(x));
        
        attendance2.registerAttendance(seminar, student1);
        student2.getSeminarsAttended().forEach(x -> System.out.println(x));
    }
}
