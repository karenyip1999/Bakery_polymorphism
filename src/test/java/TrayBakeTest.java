import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


import org.junit.jupiter.api.BeforeEach;

public class TrayBakeTest {

    private TrayBake traybake;

    @BeforeEach
    public void setUp()
    {
        traybake = new TrayBake("brownie", BaseFlavour.CHOCOLATE, false, IcingFlavour.LEMON_BUTTERCREAM, Topping.CHOCOLATE_CHIP, 8 );
    }

    @Test
    public void getNameTest()
    {
        assertThat(traybake.getNameOfCake()).isEqualTo("brownie");
    }

    @Test
    public void setNameTest()
    {
        traybake.setNameOfCake("fudge cake");
        assertThat(traybake.getNameOfCake()).isEqualTo("fudge cake");
    }

    @Test
    public void getBaseFlavourTest()
    {
        assertThat(traybake.getBaseFlavour()).isEqualTo(BaseFlavour.CHOCOLATE);
    }

    @Test
    public void setBaseFlavourTest()
    {
        traybake.setBaseFlavour(BaseFlavour.RED_VELVET);
        assertThat(traybake.getBaseFlavour()).isEqualTo(BaseFlavour.RED_VELVET);
    }

    @Test
    public void isGlutenFreeTest()
    {
        assertThat(traybake.isGlutenFree()).isEqualTo(false);
    }

    @Test
    public void getIcingFlavourTest()
    {
        assertThat(traybake.getIcingFlavour()).isEqualTo(IcingFlavour.LEMON_BUTTERCREAM);
    }

    @Test
    public void setIcingFlavourTest()
    {
        traybake.setIcingFlavour(IcingFlavour.CREAM_CHEESE);
        assertThat(traybake.getIcingFlavour()).isEqualTo(IcingFlavour.CREAM_CHEESE);
    }

    @Test
    public void getToppingTest()
    {
        assertThat(traybake.getTopping()).isEqualTo(Topping.CHOCOLATE_CHIP);
    }

    @Test
    public void setToppingTest()
    {
        traybake.setTopping(Topping.MARSHMALLOWS);
        assertThat(traybake.getTopping()).isEqualTo(Topping.MARSHMALLOWS);
    }

    @Test
    public void getServingsTest()
    {
        assertThat(traybake.getNumOfServings()).isEqualTo(8);
    }

    @Test
    public void setServingsTest()
    {
        traybake.setNumOfServings(10);
        assertThat(traybake.getNumOfServings()).isEqualTo(10);
    }

}
