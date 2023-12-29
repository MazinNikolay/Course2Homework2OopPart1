public abstract class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustOfPower;

    public Slytherin(int magicPower, int transgressDistance, int cunning, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(magicPower, transgressDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }

    public void printCharacteristics() {
        System.out.println(this.getName() + ", Сила магии - " + this.getMagicPower()
                + ", Расстояние трансгрессии - " + this.getTransgressDistance()
                + ", Хитрость - " + cunning
                + ", Решительность - " + determination
                + ", Амбициозность - " + ambition
                + ", Находчивость - " + resourcefulness
                + ", Жажда власти - " + lustOfPower);
    }

    public String compareCharacteristic(StudentSlytherin compareStudent) {
        int firstStudentCharacteristic = this.getMagicPower()
                + this.getTransgressDistance()
                + cunning
                + determination
                + ambition
                + resourcefulness
                + lustOfPower;
        int secondStudentCharacteristic = compareStudent.getMagicPower()
                + compareStudent.getTransgressDistance()
                + compareStudent.getCunning()
                + compareStudent.getDetermination()
                + compareStudent.getAmbition()
                + compareStudent.getResourcefulness()
                + compareStudent.getLustOfPower();
        if (firstStudentCharacteristic > secondStudentCharacteristic) {
            return this.getName() + " лучший Слизеринец, чем " + compareStudent.getName();
        } else if (firstStudentCharacteristic < secondStudentCharacteristic) {
            return compareStudent.getName() + " лучший Слизеринец, чем " + this.getName();
        } else {
            return "Характеристики равны";
        }
    }
}
