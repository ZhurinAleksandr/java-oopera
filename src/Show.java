import java.util.ArrayList;

public class Show {

    protected String title;
    protected double duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, double duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<Actor>();
    }

    public boolean isActorExists(Actor actor) {
        for (Actor existActor : listOfActors) {
            if (existActor.equals(actor)) {
                return true;
            }
        }
        return false;
    }

    public void addActor(Actor actor) {
        if (isActorExists(actor)) {
            System.out.println("Такой актер уже находится в списке");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        boolean found = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.surname.equals(surname)) {
                listOfActors.set(i, newActor);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("В нашем театре нет актера с фамилией: " + surname);
        }
    }
}
