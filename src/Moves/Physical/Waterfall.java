package Moves.Physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Waterfall extends PhysicalMove {
    public Waterfall(){
        super(Type.WATER, 80, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if ((Math.random() <= 0.20)) Effect.flinch(p);
    }

    @Override
    protected String describe() {
        return "совершает мощную водную атаку рывком и с вероятностью 20% заставляет цель вздрогнуть";
    }
}
