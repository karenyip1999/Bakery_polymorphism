import java.util.ArrayList;

public class Bakery {

    private ArrayList<Cake> cakes;

    public Bakery()
    {
        this.cakes = new ArrayList<>();
    }

    public int countCakes()
    {
        return cakes.size();
    }

    public void addCake(Cake cake)
    {
        cakes.add(cake);
    }
}
