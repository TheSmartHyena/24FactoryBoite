public class BoiteSpecial extends ABoite {
    public BoiteSpecial(String color) {
        super(color);
    }

    @Override
    public void lift() {
        System.out.println("Soulève tout seul");
    }

    public void liftWithAccident() {
        System.out.println("Soulève tout seul, et blocage du dos");
    }
}
