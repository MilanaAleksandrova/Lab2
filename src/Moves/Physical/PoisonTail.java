package Moves.Physical;

import ru.ifmo.se.pokemon.*;

public class PoisonTail extends PhysicalMove {
    public PoisonTail(){
        super(Type.POISON, 50, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if ((Math.random() <= 0.10)) Effect.poison(p);
    }

    protected double calcCriticalHit(Pokemon var1, Pokemon var2) {
        if (1/8. > Math.random()) {
            System.out.println("Особый критический удар!");
            return 2.0;
        } else {
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        return "бьет цель своим хвостом и имеет 10% шанс отравить её, критические удары наносятся с повышенной вероятностью";
    }
}
