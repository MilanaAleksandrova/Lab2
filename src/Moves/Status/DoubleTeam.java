package Moves.Status;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 1);
    }

    @Override
    protected String describe(){
        return "двигается быстро и создает иллюзорные копии самого себя, чтобы повысить свою уклончивость на одну ступень";
    }

}
