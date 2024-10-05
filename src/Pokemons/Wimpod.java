package Pokemons;

import Moves.Status.DoubleTeam;
import Moves.Physical.Facade;
import Moves.Physical.Waterfall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wimpod extends Pokemon {
    public Wimpod(String name, int level){
        super(name, level);
        setType(Type.BUG, Type.WATER);
        setStats(25, 35, 40, 20, 30, 80);
        setMove(new Facade(), new Waterfall(), new DoubleTeam());
    }
}
