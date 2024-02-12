public class Cupcake extends Cake{

    private boolean healthier;
    public Cupcake(String name, BaseFlavour baseFlavour, boolean isGlutenFree, IcingFlavour icingFlavour, Topping topping, boolean healthier)
    {
        super(name, baseFlavour, isGlutenFree, icingFlavour, topping);
        this.healthier = true;
    }

    public boolean isHealthierOption()
    {
        return true;
    }
}
