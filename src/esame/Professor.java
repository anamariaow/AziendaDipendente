package esame;

public class Professor extends Person{
    private Integer yearsOfExperience;

    public Professor(String firstName, String lastName, Integer age, Integer yearsOfExperience) {
        super(firstName, lastName, age);
        this.yearsOfExperience = yearsOfExperience;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public boolean canApplyAsTutor() {
        return true;
    }

    @Override
    public boolean canApplyAsHead() {
        boolean canApplyAsHead = false;
        if (yearsOfExperience >= 10) {
            canApplyAsHead = true;
        }
        return canApplyAsHead;
    }
}
