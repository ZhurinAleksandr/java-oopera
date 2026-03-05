public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String title, double duration, Director director, String musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }

}
