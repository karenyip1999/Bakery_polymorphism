public class TieredCake extends Cake{

    private int tier;
    private int servings;

    public TieredCake(String name, BaseFlavour baseFlavour, boolean isGlutenFree, IcingFlavour icingFlavour, Topping topping, int tier, int servings) {
        super(name, baseFlavour, isGlutenFree, icingFlavour, topping);
        this.tier = tier;
        this.servings = servings;
    }

    public int numOfTiers()
    {
        return this.tier;
    }

    public void setNumOfTiers(int tiers)
    {
        this.tier = tiers;
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
