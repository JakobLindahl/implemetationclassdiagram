package implemetationclassdiagram;

import java.util.*;
import java.util.stream.*;

public class Program {

    private final Set<Seminar> seminars;
    private ProgramCoordinator programCoordinator;
    private String name;

    public Program(String name) {
        this.seminars = new HashSet<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProgramCoordinator getProgramCoordinator() {
        return programCoordinator;
    }

    public void setProgramCoordinator(ProgramCoordinator programCoordinator) {
        this.programCoordinator = programCoordinator;
    }

    public Set<Seminar> getSeminars() {
        return seminars;
    }

    public void addToSeminars(Seminar seminar) {
        this.seminars.add(seminar);
    }

    public Set<Student> getStudents() {
        return seminars
                .stream()
                .map(Seminar::getTotalAttendance)
                .flatMap(Set::stream)
                .map(Attendance::getStudent)
                .collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        return name;
    }
}
