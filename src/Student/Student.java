package Student;

public class Student {
    private String Surename;
    private String Lastname;
    private int matriknumber;
    private Courses course;

    public Student( String surename, String lastname, int matriknumber, Courses course ) {
        Surename = surename;
        Lastname = lastname;
        this.matriknumber = matriknumber;
        this.course = course;
    }

    public String getSurename() {
        return Surename;
    }

    public void setSurename( String surename ) {
        Surename = surename;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname( String lastname ) {
        Lastname = lastname;
    }

    public int getMatriknumber() {
        return matriknumber;
    }

    public void setMatriknumber( int matriknumber ) {
        this.matriknumber = matriknumber;
    }

    public Courses getCourse() {
        return course;
    }

    public void setCourse( Courses course ) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Surename='" + Surename + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", matriknumber=" + matriknumber +
                ", course=" + course +
                '}';
    }
}
