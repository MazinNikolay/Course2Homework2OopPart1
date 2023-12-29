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

    public void printCharacteristics() {
        System.out.println(this.getName() + ", Сила магии - " + this.getMagicPower()
                + ", Расстояние трансгрессии - " + this.getTransgressDistance()
                + ", Ум - " + this.getMind()
                + ", Мудрость - " + this.getWisdom()
                + ", Остороумие - " + this.getWit()
                + ", Творчество - " + this.getCreation());
    }

    public String compareCharacteristic(StudentRavenclaw compareStudent) {
        int firstStudentCharacteristic = this.getMagicPower()
                + this.getTransgressDistance()
                + this.getMind()
                + this.getWisdom()
                + this.getWit()
                + this.getCreation();
        int secondStudentCharacteristic = compareStudent.getMagicPower()
                + compareStudent.getTransgressDistance()
                + compareStudent.getMind()
                + compareStudent.getWisdom()
                + compareStudent.getWit()
                + compareStudent.getCreation();
        return firstStudentCharacteristic > secondStudentCharacteristic ?
                this.getName() + " лучший Когтевранец, чем " + compareStudent.getName()
                : compareStudent.getName() + " лучший Когтевранец, чем " + this.getName();
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
