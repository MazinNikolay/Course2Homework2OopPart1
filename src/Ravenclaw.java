public abstract class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(int magicPower, int transgressDistance, int mind, int wisdom, int wit, int creation) {
        super(magicPower, transgressDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public void printCharacteristics() {
        System.out.println(this.getName() + ", Сила магии - " + this.getMagicPower()
                + ", Расстояние трансгрессии - " + this.getTransgressDistance()
                + ", Ум - " + mind
                + ", Мудрость - " + wisdom
                + ", Остороумие - " + wit
                + ", Творчество - " + creation);
    }

    public String compareCharacteristic(StudentRavenclaw compareStudent) {
        int firstStudentCharacteristic = this.getMagicPower()
                + this.getTransgressDistance()
                + mind
                + wisdom
                + wit
                + creation;
        int secondStudentCharacteristic = compareStudent.getMagicPower()
                + compareStudent.getTransgressDistance()
                + compareStudent.getMind()
                + compareStudent.getWisdom()
                + compareStudent.getWit()
                + compareStudent.getCreation();
        if (firstStudentCharacteristic > secondStudentCharacteristic) {
            return this.getName() + " лучший Когтевранец, чем " + compareStudent.getName();
        } else if (firstStudentCharacteristic < secondStudentCharacteristic) {
            return compareStudent.getName() + " лучший Когтевранец, чем " + this.getName();
        } else {
            return "Характеристики равны";
        }
    }
}
