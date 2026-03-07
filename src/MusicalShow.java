public class MusicalShow extends Show {
    protected Person author;
    protected String librettoText;

    public MusicalShow(String title, double duration, Director director, Person author, String librettoText) {
        super(title, duration, director);
        this.author = author;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }

}
