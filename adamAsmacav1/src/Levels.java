import java.util.ArrayList;

public class Levels {
    private int life;
    private String dest;

    public void level(Base base){
        base.Oyun(this.life, this.dest);
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }
}
