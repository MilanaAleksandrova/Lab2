package Moves.Status;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 0.85);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
        p.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "сбивает противника с толку и резко повышает его атаку на 2 ступени";
    }
}
