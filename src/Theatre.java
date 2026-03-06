public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor actor1 = new Actor("Киану", "Ривз", Gender.MALE, 186);
        Actor actor2 = new Actor("Сергей", "Бурунов", Gender.MALE, 174);
        Actor actor3 = new Actor("Натали", "Портман", Gender.FEMALE, 160);
        Director director1 = new Director("Константин", "Станиславский", Gender.MALE, 2);
        Director director2 = new Director("Всеволод", "Мейерхольд", Gender.MALE, 3);
        String author = "Юрий Келдыш";

        Show show = new Show("Ночь ее откровений", 86, director1);
        Opera opera = new Opera("Евгений Онегин", 165, director2, author,
                "Сад в усадьбе Лариных....Онегин сражён отчаянием.", 20);
        Ballet ballet = new Ballet("Жизель", 130, director2, author,
                "Французская деревня...Альберт возвращается в реальность.",
                "Рудольф", "Нуреев", Gender.MALE);
        show.addActor(actor1);
        show.addActor(actor3);
        opera.addActor(actor2);
        opera.addActor(actor3);
        ballet.addActor(actor1);
        ballet.addActor(actor2);

        System.out.println("Список актеров " + show.title + ": " + show.listOfActors);
        System.out.println("Список актеров " + opera.title + ": " + opera.listOfActors);
        System.out.println("Список актеров " + ballet.title + ": " + ballet.listOfActors);

        ballet.replaceActor(actor3, "Бурунов");

        System.out.println("Список актеров " + ballet.title + ": " + ballet.listOfActors);

        show.replaceActor(actor3, "Петров");

        opera.printLibrettoText();
        ballet.printLibrettoText();

    }
}
