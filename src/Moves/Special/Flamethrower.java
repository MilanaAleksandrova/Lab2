package Moves.Special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Flamethrower extends SpecialMove {
    public Flamethrower(){
        super(Type.FIRE, 90, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if ((Math.random() <= 0.10)) Effect.burn(p);
    }

    @Override
    protected String describe() {
        return "обжигает противника интенсивным огненным взрывом и имеет 10% шанс поджечь цель";
    }

}
