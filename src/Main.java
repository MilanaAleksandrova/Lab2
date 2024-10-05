import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon p1 = new Cleffa("Пушистка", 15);
        Pokemon p2 = new Wimpod("Мокрица", 20);
        Pokemon p3 = new Clefairy("Роза", 15);
        Pokemon p4 = new Seviper("Гюрза", 15);
        Pokemon p5 = new Clefable("Марля", 15);
        Pokemon p6 = new Golisopod("Лохнесское чудовище", 20);


        b.addAlly(p1);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addAlly(p4);
        b.addFoe(p5);
        b.addAlly(p6);

        b.go();

    }
}