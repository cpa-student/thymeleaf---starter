package comp31.thymeleaf.model;

public class Course{

    String code = "";
    String title = "";
    String grade = "";
    
    
    public Course(String code, String title, String grade) {
        this.code = code;
        this.title = title;
        this.grade = grade;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String courseCode) {
        this.code = courseCode;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
}
