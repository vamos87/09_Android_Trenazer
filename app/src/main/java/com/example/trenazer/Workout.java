package com.example.trenazer;

public class Workout {
    private String name;
    private String description;

    private Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public static final Workout[] workouts = {
            new Workout("Rozciąganie kończyn", "5 pompek w staniu na rękach, \n10 przysiadów na jednej nodze, \n15 podciągnięć"),
            new Workout("Ogólna agonia","100 podciągnięć, \n100 pompek, \n100 brzuszków, \n100 przysiadów"),
            new Workout("Tylko dla mięczaków","5 podciągnięć, \n10 pompek, \n15 przysiadów"),
            new Workout("Siła i dystans","Bieg na 500 metrów, \n21 wydźwignięć ciężarka, \n21 podciągnięć")
    };

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
