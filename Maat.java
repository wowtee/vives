package be.vives.ti;

public enum Maat {
    SMALL(36, "s"), MEDIUM(40, "m"), LARGE(42, "l"), EXTRA_LARGE(46, "xl"),
    EXTRA_EXTRA_LARGE(48, "xxl");

    private int grootte;
    private String maat;

    Maat(int grootte, String maat) {
        this.grootte = grootte;
        this.maat = maat;
    }

    public int getGrootte() {
        return grootte;
    }

    public String getMaat() {
        return maat;
    }

    @Override
    public String toString() {
        return maat;
    }
}
