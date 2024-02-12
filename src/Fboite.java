public class Fboite {
    public static ABoite createBoite(EBoites type, String color) {
        return switch (type) {
            case EBoites.CARTON -> new BoiteCarton(color);
            case EBoites.METAL -> new BoiteMetal(color);
            case EBoites.PLASTIQUE -> new BoitePlastique(color);
            case EBoites.SPECIAL -> new BoiteSpecial(color);

            default -> null;
        };
    }
}
