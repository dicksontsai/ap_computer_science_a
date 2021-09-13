package unit2;

public class Week2Warmup {
    public static void main(String[] args) throws Exception {
        President alice = new President("Alice", "CS for all!");
        System.out.println(alice.talk());
        Country spain = new Country(alice, 1000);
        System.out.println(spain.census(1500) + " " + spain.population);
        System.out.println(spain);
    }
}

class Country {
    President president;
    int population;

    Country(President president, int population) {
        this.president = president;
        this.population = population;
    }

    /**
     * Records the result of a new census by updating the country's population.
     * @param newPop The newly measured population.
     * @return The percent growth between the old and new population.
     */
    double census(int newPop) {
        int oldPop = this.population;
        this.population = newPop;
        // Be careful about integer division!
        return (((double) newPop)/oldPop - 1) * 100;
    }

    public String toString() {
        return "President: " + this.president + ", Population: " + this.population;
    }
}

class President {
    String name;
    String slogan;

    // Constructor implementation option #1
    //President(String name, String slogan) {
    //    this.name = name;
    //    this.slogan = slogan;
    //}

    // Constructor implementation option #2
    // If the parameter names are different from the field names, then you no
    // longer need to say `this.`.
    President(String myName, String mySlogan) {
        name = myName;
        slogan = mySlogan;
    }

    String talk() {
        return "Vote for me, " + this.name + "! " + this.slogan;
    }

    public String toString() {
        return this.name;
    }
}