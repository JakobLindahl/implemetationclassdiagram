package implemetationclassdiagram;

import java.util.*;

public class ProgramCoordinator {

    private final Set<Teacher> teachers;
    private String name;
    private Program program;

    public ProgramCoordinator(String name, Teacher teacher) {
        this.name = name;
        this.teachers = new HashSet<>();
        this.teachers.add(teacher);
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

    void addTeacher(Teacher teacher) {
        teacher.setProgramCoordinator(this);
        teachers.add(teacher);
    }

    boolean findTeacher(String searchFor) {
        return teachers.stream().anyMatch((teacher) -> (searchFor.equalsIgnoreCase(teacher.getName())));
    }
    
    @Override
    public String toString(){
        return name;
    }
}
