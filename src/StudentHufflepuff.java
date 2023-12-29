public class StudentHufflepuff extends Hufflepuff {
    private String firstName;
    private String lastName;

    public StudentHufflepuff(int magicPower, int transgressDistance, int hardWork, int loyalty, int honesty, String firstName, String lastName) {
        super(magicPower, transgressDistance, hardWork, loyalty, honesty);
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
