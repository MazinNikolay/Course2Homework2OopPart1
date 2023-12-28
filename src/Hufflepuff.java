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
}
