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
}
