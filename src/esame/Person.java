package esame;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public abstract boolean canApplyAsTutor();

    public abstract boolean canApplyAsHead();

    public void stampaNomeCompleto() {
        System.out.println(getFirstName() + " " + getLastName());
    }

}
