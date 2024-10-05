package Moves.Status;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC, 0, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon p){

        Effect heal = new Effect().turns(1).stat(Stat.HP, (int) - (p.getStat(Stat.HP) - p.getHP()));
        Effect rest = new Effect().turns(2).condition(Status.SLEEP);
        p.addEffect(heal);
        p.addEffect(rest);

    }

    @Override
    protected String describe() {
        return "спит 2 хода, восстанавливая здоровье и статус";
    }
}
