package Pokemons;

import Moves.Special.DarkPulse;
import Moves.Physical.PoisonTail;
import Moves.Status.Rest;
import Moves.Status.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seviper extends Pokemon {
    public Seviper(String name, int level){
        super(name, level);
        setType(Type.POISON);
        setStats(73, 100, 60, 100, 60, 65);
        setMove(new PoisonTail(), new Swagger(), new Rest(), new DarkPulse());
    }
}
