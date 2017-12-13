package implemetationclassdiagram;

public class Subject {

    private String name;
    private Seminar seminar;

    public Subject(String name, Seminar seminar) {
        this.name = name;
        this.seminar = seminar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public void viewSubjectInfo() {

    }
    
    @Override
    public String toString(){
        return name;
    }
}
