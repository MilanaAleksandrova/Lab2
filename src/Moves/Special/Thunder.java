package Moves.Special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunder extends SpecialMove {
    public Thunder(){
        super(Type.ELECTRIC, 110,0.70);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if ((Math.random() <= 0.30)) Effect.paralyze(p);
    }

    @Override
    protected String describe() {
        return "сбрасывает злую молнию на врага и имеет 30% шанс парализовать цель";
    }
}
