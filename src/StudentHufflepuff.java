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

    public void printCharacteristics() {
        System.out.println(this.getName() + ", Сила магии - " + this.getMagicPower()
                + ", Расстояние трансгрессии - " + this.getTransgressDistance()
                + ", Трудолюбие - " + this.getHardWork()
                + ", Верность - " + this.getLoyalty()
                + ", Честность - " + this.getHonesty());
    }

    public String compareCharacteristic(StudentHufflepuff compareStudent) {
        int firstStudentCharacteristic = this.getMagicPower()
                + this.getTransgressDistance()
                + this.getHardWork()
                + this.getLoyalty()
                + this.getHonesty();
        int secondStudentCharacteristic = compareStudent.getMagicPower()
                + compareStudent.getTransgressDistance()
                + compareStudent.getHardWork()
                + compareStudent.getLoyalty()
                + compareStudent.getHonesty();
        return firstStudentCharacteristic > secondStudentCharacteristic ?
                this.getName() + " лучший Пуффендуец, чем " + compareStudent.getName()
                : compareStudent.getName() + " лучший Пуффендуец, чем " + this.getName();
    }
}
