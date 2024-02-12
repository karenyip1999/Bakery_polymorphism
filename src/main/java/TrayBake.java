public class TrayBake extends Cake{

    private int servings;
    public TrayBake(String name, BaseFlavour baseFlavour, boolean isGlutenFree, IcingFlavour icingFlavour, Topping topping, int servings) {
        super(name, baseFlavour, isGlutenFree, icingFlavour, topping);
        this.servings = servings;
    }

    public int getNumOfServings()
    {
        return this.servings;
    }

    public void setNumOfServings(int servingAmount)
    {
        this.servings = servingAmount;
    }
}
