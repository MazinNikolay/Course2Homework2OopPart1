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

    public void printCharacteristics() {
        System.out.println(this.getName() + ", Сила магии - " + this.getMagicPower()
                + ", Расстояние трансгрессии - " + this.getTransgressDistance()
                + ", Хитрость - " + this.getCunning()
                + ", Решительность - " + this.getDetermination()
                + ", Амбициозность - " + this.getAmbition()
                + ", Находчивость - " + this.getResourcefulness()
                + ", Жажда власти - " + this.getLustOfPower());
    }

    public String compareCharacteristic(StudentSlytherin compareStudent) {
        int firstStudentCharacteristic = this.getMagicPower()
                + this.getTransgressDistance()
                + this.getCunning()
                + this.getDetermination()
                + this.getAmbition()
                + this.getResourcefulness()
                + this.getLustOfPower();
        int secondStudentCharacteristic = compareStudent.getMagicPower()
                + compareStudent.getTransgressDistance()
                + compareStudent.getCunning()
                + compareStudent.getDetermination()
                + compareStudent.getAmbition()
                + compareStudent.getResourcefulness()
                + compareStudent.getLustOfPower();

        return firstStudentCharacteristic > secondStudentCharacteristic ?
                this.getName() + " лучший Слизеринец, чем " + compareStudent.getName()
                : compareStudent.getName() + " лучший Слизеринец, чем " + this.getName();
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
