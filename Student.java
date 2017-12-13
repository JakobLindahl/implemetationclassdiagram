package implemetationclassdiagram;

import java.util.*;
import java.util.stream.*;

public class Student {

    private final Set<Attendance> attendance;
    private String name;

    public Student(String name) {
        this.attendance = new HashSet<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addToAttendance(Attendance attendance){
        this.attendance.add(attendance);
    }
    
    public void removeAttendance(Attendance attendance){
        this.attendance.remove(attendance);
    }
    
    public Set<Seminar> getSeminarsAttended(){
        return attendance.stream()
                .filter(attended -> attended.AttendanceLevel())
                .map(Attendance::getSeminar).collect(Collectors.toSet());
    }
    
    public void attendSeminar(Attendance attendance){
        attendance.registerAttendance(attendance.getSeminar(), this);
    }
    
    @Override
    public String toString(){
        return name;
    }
}