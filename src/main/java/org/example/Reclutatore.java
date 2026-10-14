package org.example;

import net.datafaker.Faker;
import org.yaml.snakeyaml.util.Tuple;

import java.util.Random;

public class Reclutatore {
    Random random;
    Faker faker;
    public Reclutatore(){
        random = new Random();
        faker = new Faker();
    }

    public Tuple<String, Integer> GenerateRandomHero(){
        return new Tuple<String, Integer>(faker.superhero().name(), random.nextInt(100) + 1);
    }
}
