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

    public void printCharacteristics() {
        System.out.println(this.getName() + ", Сила магии - " + this.getMagicPower()
                + ", Расстояние трансгрессии - " + this.getTransgressDistance()
                + ", Благородство - " + this.getNobility()
                + ", Честь - " + this.getHonor()
                + ", Храбрость - " + this.getBrave());
    }

    public String compareCharacteristic(StudentGryffindor compareStudent) {
        int firstStudentCharacteristic = this.getMagicPower()
                + this.getTransgressDistance()
                + this.getNobility()
                + this.getHonor()
                + this.getBrave();
        int secondStudentCharacteristic = compareStudent.getMagicPower()
                + compareStudent.getTransgressDistance()
                + compareStudent.getBrave()
                + compareStudent.getHonor()
                + compareStudent.getBrave();
        return firstStudentCharacteristic > secondStudentCharacteristic ?
                this.getName() + " лучший Гриффиндорец, чем " + compareStudent.getName()
                : compareStudent.getName() + " лучший Гриффиндорец, чем " + this.getName();
    }

    public String compareTransgressDistance(Hogwarts compareStudent) {
        return this.getTransgressDistance() > compareStudent.getTransgressDistance() ?
                this.getName() + " обладает бОльшей дальностью трансгрессии, чем " + compareStudent.getName() :
                compareStudent.getName() + " обладает бОльшей дальностью трансгрессии, чем " + this.getName();
    }

    public String compareMagicPower(Hogwarts compareStudent) {
        return this.getMagicPower() > compareStudent.getMagicPower() ?
                this.getName() + " обладает бОльшей мощностью магии, чем " + compareStudent.getName() :
                compareStudent.getName() + " обладает бОльшей мощностью магии, чем " + this.getName();
    }
}
