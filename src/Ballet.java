public class Ballet extends MusicalShow {
    protected Person choreographer;

    public Ballet(String title, double duration, Director director, String author, String librettoText,
                  String choreographerName, String choreographerSurname, Gender choreographerGender) {
        super(title, duration, director, author, librettoText);
        this.choreographer = new Person(choreographerName, choreographerSurname, choreographerGender);
    }
}
