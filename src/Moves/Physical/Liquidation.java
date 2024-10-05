package Moves.Physical;

import ru.ifmo.se.pokemon.*;

public class Liquidation extends PhysicalMove {
    public Liquidation(){
        super(Type.WATER, 85, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if ((Math.random() <= 0.20)) p.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe() {
        return "врезается в цель, используя мощную струю воды, имеет 20% снизить её защиту";
    }

}
