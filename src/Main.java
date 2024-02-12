import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ABoite> items = new ArrayList<ABoite>();

        items.add(Fboite.createBoite(EBoites.CARTON, "Rouge"));
        items.add(Fboite.createBoite(EBoites.METAL, "Rouge"));
        items.add(Fboite.createBoite(EBoites.PLASTIQUE, "Rouge"));
        items.add(Fboite.createBoite(EBoites.SPECIAL, "Rouge"));

        for (ABoite item : items) {
            if (item instanceof BoiteSpecial) {
                BoiteSpecial boiteSpe = ((BoiteSpecial) item);
                boiteSpe.liftWithAccident();
                boiteSpe.lift();
            } else {
                item.lift();
            }
        }
    }
}