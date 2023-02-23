package polymorphismEx;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {

            Movie movie = randomMovie();

            System.out.println("Loop #" + i + " Current movie is: " + movie.getTitle() + " And the plot is: " + movie.plot());

        }










    }

    public static Movie randomMovie() {

        int randomNumber = (int) (Math.random() * 5) + 1;

        switch (randomNumber) {
            case 1:
                return new Intersteller();
            case 2:
                return new Tron();
            case 3:
                return new Blade();
            case 4:
                return new EverythingEverywhere();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}




class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String plot () {
        return "No plot here dude";
    }

    public String getTitle() {
        return title;
    }
}




class Intersteller extends Movie{

    public Intersteller() {
        super("Intersteller");
    }

    @Override
    public String plot() {
        return "A movie about a space farmer";
    }
}




class Tron extends Movie {

    public Tron() {
        super("Tron");
    }

    @Override
    public String plot() {
        return "A movie about the computer world with cool motorcycles and cool music by daft punk";
    }
}




class Blade extends Movie {

    public Blade() {
        super("Blade");
    }

    @Override
    public String plot() {
        return "A movie about the day walker fighting vampires";
    }
}




class EverythingEverywhere extends Movie {

    public EverythingEverywhere() {
        super("Everything Everywhere All at Once");
    }

    @Override
    public String plot() {
        return "A movie about a mom who can see the multiverse";
    }
}




class Forgetable extends Movie{

    public Forgetable() {
        super("Forgetable");
    }
}
