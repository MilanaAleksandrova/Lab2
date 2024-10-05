package Moves.Physical;

import ru.ifmo.se.pokemon.*;

public class WakeUpSlap extends PhysicalMove {

    public WakeUpSlap(){
        super(Type.FIGHTING, 70, 1);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        if(p.getCondition().equals(Status.SLEEP)) {
            p.setMod(Stat.HP, (int) Math.round(damage) * 2); //TODO и это удвоенный урон?
        }
        else super.applyOppDamage(p, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (p.getCondition().equals(Status.SLEEP)) {
            p.addEffect(new Effect().condition(Status.NORMAL));
        }
    }

    @Override
    protected String describe(){
            return "наносит удвоенный урон и будит, если противник спит, иначе наносит обычный урон";
    } //TODO хочется 2 разных сообщения в зависимости от того, спит противник или нет


}
