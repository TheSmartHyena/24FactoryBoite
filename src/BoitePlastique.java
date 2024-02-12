public class BoitePlastique extends ABoite {
    public BoitePlastique(String color) {
        super(color);
    }
    @Override
    public void lift() {
        System.out.println("Soulève à deux");
    }
}
