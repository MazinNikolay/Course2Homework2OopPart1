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
}
