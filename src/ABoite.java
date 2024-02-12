public abstract class  ABoite {
    private String color;

    public ABoite(String color) {
        this.color = color;
    }

    private EBoites type;

    public EBoites getType() {
        return this.type;
    }

    public abstract void lift();
}
