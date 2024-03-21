package simulazione;

public abstract class Employee {
    private Integer id;
    private String name;
    private Float efficencyIndex;

    public Employee(Integer id, String name, Float efficencyIndex) {
        this.id = id;
        this.name = name;
        this.efficencyIndex = efficencyIndex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getEfficencyIndex() {
        return efficencyIndex;
    }

    public void setEfficencyIndex(Float efficencyIndex) {
        this.efficencyIndex = efficencyIndex;
    }

    public abstract boolean canApplyForPromotion();

    public abstract boolean mayBeDemoted();

    public void stampaDettagli() {
        System.out.println("ID: " + id + " - Nome: " + name + " - Efficency Index: " +efficencyIndex);
    }
}
