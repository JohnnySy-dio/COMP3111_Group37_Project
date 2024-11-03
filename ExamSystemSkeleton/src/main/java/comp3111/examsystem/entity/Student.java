package comp3111.examsystem.entity;


public class Student {
    private String username;
    private String password;
    private String name;
    private String gender;
    private String department;


    public Student(String u, String p, String n, String g, String d) {
        username = u;
        password = p;
        name = n;
        gender = g;
        department = d;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
