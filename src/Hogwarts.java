public abstract class Hogwarts {
    private int magicPower;
    private int transgressDistance;

    public Hogwarts(int magicPower, int transgressDistance) {
        this.magicPower = magicPower;
        this.transgressDistance = transgressDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public void setTransgressDistance(int transgressDistance) {
        this.transgressDistance = transgressDistance;
    }

    public abstract String getName();

    public String compareTransgressDistance(Hogwarts compareStudent) {
        if (this.getTransgressDistance() > compareStudent.getTransgressDistance()) {
            return this.getName() + " обладает бОльшей дальностью трансгрессии, чем " + compareStudent.getName();
        } else if (this.getTransgressDistance() < compareStudent.getTransgressDistance()) {
            return compareStudent.getName() + " обладает бОльшей дальностью трансгрессии, чем " + this.getName();
        } else return "Дальность трансгресии студентов одинакова";
    }

    public String compareMagicPower(Hogwarts compareStudent) {
        if (this.getMagicPower() > compareStudent.getMagicPower()) {
            return this.getName() + " обладает бОльшей мощностью магии, чем " + compareStudent.getName();
        } else if (this.getMagicPower() < compareStudent.getMagicPower()) {
            return compareStudent.getName() + " обладает бОльшей мощностью магии, чем " + this.getName();
        } else {
            return "Мощность магии студентов одинакова";
        }
    }
}
