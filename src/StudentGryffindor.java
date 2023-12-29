public class StudentGryffindor extends Gryffindor {
    private String firstName;
    private String lastName;

    public StudentGryffindor(int magicPower, int transgressDistance, int nobility, int honor, int brave, String firstName, String lastName) {
        super(magicPower, transgressDistance, nobility, honor, brave);
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
