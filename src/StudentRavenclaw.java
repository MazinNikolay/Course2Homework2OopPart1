public class StudentRavenclaw extends Ravenclaw {
    private String firstName;
    private String lastName;

    public StudentRavenclaw(int magicPower, int transgressDistance, int mind, int wisdom, int wit, int creation, String firstName, String lastName) {
        super(magicPower, transgressDistance, mind, wisdom, wit, creation);
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
