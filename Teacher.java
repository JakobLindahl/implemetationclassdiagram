package implemetationclassdiagram;

import java.util.*;

public class Teacher {

    private final List<Seminar> seminarHistory;
    private ProgramCoordinator programCoordinator;
    private String name;
    private Seminar seminar;

    public Teacher(String name) {
        seminarHistory = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
    
    public void setProgramCoordinator(ProgramCoordinator programCoordinator) {
        this.programCoordinator = programCoordinator;
    }

    public void addToSeminarHistory(Seminar seminar) {
        this.seminarHistory.add(seminar);
    }

    public List<Seminar> getSeminarHistory() {
        return seminarHistory;
    }
    
    public void setCurrentSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public Seminar getCurrentSeminar() {
        return seminar;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
