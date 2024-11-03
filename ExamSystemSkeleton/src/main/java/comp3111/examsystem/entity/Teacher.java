package comp3111.examsystem.entity;

public class Teacher {
    private String username;
    private String password;
    private String Gender;
    private String Name;
    private String postition;
    private String department;


    public Teacher(String username, String password, String Gender, String Name, String postition, String department) {
        this.username = username;
        this.password = password;
        this.Gender = Gender;
        this.Name = Name;
        this.postition = postition;
        this.department = department;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return Gender;
    }

    public String getName() {
        return Name;
    }

    public String getPostition() {
        return postition;
    }

    public String getDepartment() {
        return department;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
