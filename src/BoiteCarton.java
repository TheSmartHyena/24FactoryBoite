public class BoiteCarton extends ABoite {


    public BoiteCarton(String color) {
        super(color);
    }

    @Override
    public void lift() {
        System.out.println("Soulève à la main");
    }
}
