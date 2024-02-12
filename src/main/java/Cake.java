public abstract class Cake {

    private String name;

    //BaseFlavour enum {Vanilla, chocolate, red_velvet}
    private BaseFlavour baseFlavour ;
    private boolean isGlutenFree;
    private IcingFlavour icingFlavour;
    private Topping topping;

    public Cake(String name, BaseFlavour baseFlavour, boolean isGlutenFree, IcingFlavour icingFlavour, Topping topping)
    {
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.isGlutenFree = isGlutenFree;
        this.icingFlavour = icingFlavour;
        this.topping = topping;
    }

    public String getNameOfCake()
    {
        return this.name;
    }

    public void setNameOfCake(String name)
    {
        this.name = name;
    }

    public BaseFlavour getBaseFlavour()
    {
        return baseFlavour;
    }

    public void setBaseFlavour(BaseFlavour newBaseFlavour)
    {
        this.baseFlavour = newBaseFlavour;
    }

    /* public boolean isGlutenFree()
    {
        if (isGlutenFree == true)
        {
            return true;
        }
        else{
            return false;
        }
    }
    */

    public IcingFlavour getIcingFlavour() {
        return icingFlavour;
    }

    public void setIcingFlavour(IcingFlavour newIcingFlavour)
    {
        this.icingFlavour = newIcingFlavour;
    }

    public Topping getTopping()
    {
        return this.topping;
    }

    public void setTopping(Topping newTopping)
    {
        this.topping = newTopping;
    }
}
