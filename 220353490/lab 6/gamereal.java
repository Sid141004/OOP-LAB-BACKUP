public class gamereal {
    public static void main(String[] args) {
        Game game1 = new Game();
        Game game2 = new Cricket();
        Game game3 = new Chess();

        game1.type();  // Calls the base class method
        game2.type();  // Calls the Cricket subclass method
        game3.type();  // Calls the Chess subclass method
    }
}
class Game {
    public void type() {
        System.out.println("Indoor & outdoor games");
    }
}

class Cricket extends Game {
    public void type() {
        System.out.println("Cricket is an outdoor game");
    }
}

class Chess extends Game {
    public void type() {
        System.out.println("Chess is an indoor game");
    }
}


