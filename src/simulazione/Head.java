package simulazione;

public class Head extends Employee{
    private Integer yearsAsHead;

    public Head(Integer id, String name, Float efficencyIndex, Integer yearsAsHead) {
        super(id, name, efficencyIndex);
        this.yearsAsHead = yearsAsHead;
    }

    public Integer getYearsAsHead() {
        return yearsAsHead;
    }

    public void setYearsAsHead(Integer yearsAsHead) {
        this.yearsAsHead = yearsAsHead;
    }

    @Override
    public boolean canApplyForPromotion() {
        return false;
    }

    @Override
    public boolean mayBeDemoted() {
        boolean mayBeDemoted = false;
        if(yearsAsHead < 10 && getEfficencyIndex() < 0.5) {
            mayBeDemoted = true;
        }
        return mayBeDemoted;
    }
}
