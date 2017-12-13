package implemetationclassdiagram;

import java.util.*;

public class Seminar {

    private final Set<Subject> subjects;
    private final Set<Attendance> attendance;
    private String name;
    private Program program;
    private Teacher teacher;

    public Seminar(String name, Teacher teacher, Program program) {
        this.subjects = new HashSet<>();
        this.attendance = new HashSet<>();
        this.name = name;
        this.teacher = teacher;
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void addToSubjects(Subject subjects) {
        this.subjects.add(subjects);
    }
    
    public void removeSubjects(Subject subjects) {
        this.subjects.remove(subjects);
    }

    public void addAttendance(Attendance attendance) {
        this.attendance.add(attendance);
    }
    
    public void removeAttendance(Attendance attendance) {
        this.attendance.remove(attendance);
    }

    public Set<Attendance> getTotalAttendance() {
        return attendance;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
