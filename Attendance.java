package implemetationclassdiagram;

public class Attendance {

    private Seminar seminar;
    private Student student;
    private boolean attendanceLevel;

    public Attendance(Seminar seminar, Student student) {
        this.seminar = seminar;
        this.student = student;
        this.attendanceLevel = false;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public boolean AttendanceLevel() {
        return attendanceLevel;
    }

    public void registerAttendance(Seminar seminar, Student student) {
        if (this.seminar == seminar && this.student == student) {
            attendanceLevel = true;
        }
    }

    public void removeAttendance(Seminar seminar, Student student) {
        if (this.seminar == seminar && this.student == student) {
            attendanceLevel = false;
        }
    }
}
