public class Opera extends MusicalShow {
    protected int choirSize;

    public Opera(String title, double duration, Director director, Person author, String librettoText, int choirSize) {
        super(title, duration, director, author, librettoText);
        this.choirSize = choirSize;
    }
}
