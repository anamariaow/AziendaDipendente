package esame;

public class Student extends Person{
    private Integer courseYear;

    public Student(String firstName, String lastName, Integer age, Integer courseYear) {
        super(firstName, lastName, age);
        this.courseYear = courseYear;
    }

    public Integer getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(Integer courseYear) {
        this.courseYear = courseYear;
    }

    @Override
    public boolean canApplyAsTutor() {
        boolean canApplyAsTutor = false;
        if(courseYear >= 3) {
            canApplyAsTutor = true;
        }
        return canApplyAsTutor;
    }

    @Override
    public boolean canApplyAsHead() {
        return false;
    }
}
