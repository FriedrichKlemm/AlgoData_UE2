package Student;

public enum Courses {
    C1("Englisch"),
    C2("Computing"),
    C3("Science");

    private String name;

    Courses(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "name='" + name + '\'' +
                '}';
    }
}
