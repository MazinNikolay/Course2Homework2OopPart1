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
}
