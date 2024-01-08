public abstract class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int brave;

    public Gryffindor(int magicPower, int transgressDistance, int nobility, int honor, int brave) {
        super(magicPower, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getNobility() {
        return nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getHonor() {
        return honor;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    public int getBrave() {
        return brave;
    }

    public void printCharacteristics() {
        System.out.println(this.getName() + ", Сила магии - " + this.getMagicPower()
                + ", Расстояние трансгрессии - " + this.getTransgressDistance()
                + ", Благородство - " + nobility
                + ", Честь - " + honor
                + ", Храбрость - " + brave);
    }

    public String compareCharacteristic(StudentGryffindor compareStudent) {
        int firstStudentCharacteristic = this.getMagicPower()
                + this.getTransgressDistance()
                + nobility
                + honor
                + brave;
        int secondStudentCharacteristic = compareStudent.getMagicPower()
                + compareStudent.getTransgressDistance()
                + compareStudent.getNobility()
                + compareStudent.getHonor()
                + compareStudent.getBrave();
        if (firstStudentCharacteristic > secondStudentCharacteristic) {
            return this.getName() + " лучший Гриффиндорец, чем " + compareStudent.getName();
        } else if (firstStudentCharacteristic < secondStudentCharacteristic) {
            return compareStudent.getName() + " лучший Гриффиндорец, чем " + this.getName();
        } else {
            return "Характеристики равны";
        }
    }
}
