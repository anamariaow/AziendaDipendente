package simulazione;

public class Workman extends Employee{
    private Integer weeklyWorkingHours;

    public Workman(Integer id, String name, Float efficencyIndex, Integer weeklyWorkingHours) {
        super(id, name, efficencyIndex);
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    public Integer getWeeklyWorkingHours() {
        return weeklyWorkingHours;
    }

    public void setWeeklyWorkingHours(Integer weeklyWorkingHours) {
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    @Override
    public boolean canApplyForPromotion() {
        boolean canApplyForPromotion = false;
        if(weeklyWorkingHours > 35 &&  getEfficencyIndex() > 0.65) {
            canApplyForPromotion = true;
        }
        return canApplyForPromotion;
    }

    @Override
    public boolean mayBeDemoted() {
        return false;
    }
}
