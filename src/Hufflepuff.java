public abstract class Hufflepuff extends Hogwarts {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public Hufflepuff(int magicPower, int transgressDistance, int hardWork, int loyalty, int honesty) {
        super(magicPower, transgressDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setHonesty(int honnesty) {
        this.honesty = honnesty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void printCharacteristics() {
        System.out.println(this.getName() + ", Сила магии - " + this.getMagicPower()
                + ", Расстояние трансгрессии - " + this.getTransgressDistance()
                + ", Трудолюбие - " + hardWork
                + ", Верность - " + loyalty
                + ", Честность - " + honesty);
    }

    public String compareCharacteristic(StudentHufflepuff compareStudent) {
        int firstStudentCharacteristic = this.getMagicPower()
                + this.getTransgressDistance()
                + hardWork
                + loyalty
                + honesty;
        int secondStudentCharacteristic = compareStudent.getMagicPower()
                + compareStudent.getTransgressDistance()
                + compareStudent.getHardWork()
                + compareStudent.getLoyalty()
                + compareStudent.getHonesty();
        if (firstStudentCharacteristic > secondStudentCharacteristic) {
            return this.getName() + " лучший Пуффендуец, чем " + compareStudent.getName();
        } else if (firstStudentCharacteristic < secondStudentCharacteristic) {
            return compareStudent.getName() + " лучший Пуффендуец, чем " + this.getName();
        } else {
            return "Характеристики равны";
        }
    }
}
