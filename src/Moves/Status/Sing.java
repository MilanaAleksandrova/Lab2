package Moves.Status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Sing extends StatusMove {
    public Sing(){
        super(Type.NORMAL, 0, 0.55);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.sleep(p);
    }

    @Override
    protected String describe(){
        return "поет колыбельную, которая погружает жертву в глубокий сон";
    }
}
