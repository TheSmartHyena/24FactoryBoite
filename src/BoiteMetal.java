public class BoiteMetal extends ABoite {
    public BoiteMetal(String color) {
        super(color);
    }
    @Override
    public void lift() {
        System.out.println("Soulève avec un Fenwick");
    }
}
