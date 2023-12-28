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
}
