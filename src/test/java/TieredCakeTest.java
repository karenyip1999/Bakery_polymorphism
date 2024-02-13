import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;

public class TieredCakeTest {

    private TieredCake tieredCake;

    @BeforeEach
    public void setUp()
    {
        tieredCake = new TieredCake("wedding cake", BaseFlavour.VANILLA, true, IcingFlavour.VANILLA_BUTTERCREAM, Topping.STRAWBERRY, 3, 20);
    }

    @Test
    public void getNameTest()
    {
        assertThat(tieredCake.getNameOfCake()).isEqualTo("wedding cake");
    }

    @Test
    public void setNameTest()
    {
        tieredCake.setNameOfCake("tea cake");
        assertThat(tieredCake.getNameOfCake()).isEqualTo("tea cake");
    }

    @Test
    public void getBaseFlavourTest()
    {
        assertThat(tieredCake.getBaseFlavour()).isEqualTo(BaseFlavour.VANILLA);
    }

    @Test
    public void setBaseFlavourTest()
    {
        tieredCake.setBaseFlavour(BaseFlavour.RED_VELVET);
        assertThat(tieredCake.getBaseFlavour()).isEqualTo(BaseFlavour.RED_VELVET);
    }

    @Test
    public void isGlutenFreeTest()
    {
        assertThat(tieredCake.isGlutenFree()).isEqualTo(true);
    }

    @Test
    public void getIcingFlavourTest()
    {
        assertThat(tieredCake.getIcingFlavour()).isEqualTo(IcingFlavour.VANILLA_BUTTERCREAM);
    }

    @Test
    public void setIcingFlavourTest()
    {
        tieredCake.setIcingFlavour(IcingFlavour.CREAM_CHEESE);
        assertThat(tieredCake.getIcingFlavour()).isEqualTo(IcingFlavour.CREAM_CHEESE);
    }

    @Test
    public void getToppingTest()
    {
        assertThat(tieredCake.getTopping()).isEqualTo(Topping.STRAWBERRY);
    }

    @Test
    public void setToppingTest()
    {
        tieredCake.setTopping(Topping.MARSHMALLOWS);
        assertThat(tieredCake.getTopping()).isEqualTo(Topping.MARSHMALLOWS);
    }

    @Test
    public void getTierCountTest()
    {
        assertThat(tieredCake.numOfTiers()).isEqualTo(3);
    }

    @Test
    public void setTierCountTest()
    {
        tieredCake.setNumOfTiers(5);
        assertThat(tieredCake.numOfTiers()).isEqualTo(5);
    }
    @Test
    public void getServingsTest()
    {
        assertThat(tieredCake.getNumOfServings()).isEqualTo(20);
    }

    @Test
    public void setServingsTest()
    {
        tieredCake.setNumOfServings(10);
        assertThat(tieredCake.getNumOfServings()).isEqualTo(10);
    }


}
