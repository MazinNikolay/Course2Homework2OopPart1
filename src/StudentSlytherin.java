public class StudentSlytherin extends Slytherin {
    private String firstName;
    private String lastName;

    public StudentSlytherin(int magicPower, int transgressDistance, int cunning, int determination, int ambition, int resourcefulness, int lustOfPower, String firstName, String lastName) {
        super(magicPower, transgressDistance, cunning, determination, ambition, resourcefulness, lustOfPower);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
