package Moves.Physical;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        if(p.getCondition().equals(Status.BURN) || p.getCondition().equals(Status.POISON) || p.getCondition().equals(Status.PARALYZE)) {
            p.addEffect(new Effect().stat(Stat.ATTACK, (int) (2 * p.getStat(Stat.ATTACK))));
        }
    }

    @Override
    protected String describe() {
        return "исполняет атакующий прием, сила которого удваивается, если использующий его отравлен, обожжен или парализован";
    }

}
