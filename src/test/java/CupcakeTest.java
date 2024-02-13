import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;

public class CupcakeTest {

    private Cupcake cupcake;

    @BeforeEach
    public void setUp() {
        cupcake = new Cupcake("fairy cake", BaseFlavour.VANILLA, true, IcingFlavour.LEMON_BUTTERCREAM, Topping.SPRINKLES, true);
    }

    @Test
    public void getNameTest()
    {
        assertThat(cupcake.getNameOfCake()).isEqualTo("fairy cake");
    }

    @Test
    public void setNameTest()
    {
        cupcake.setNameOfCake("cookie monster");
        assertThat(cupcake.getNameOfCake()).isEqualTo("cookie monster");
    }

    @Test
    public void getBaseFlavourTest()
    {
        assertThat(cupcake.getBaseFlavour()).isEqualTo(BaseFlavour.VANILLA);
    }

    @Test
    public void setBaseFlavourTest()
    {
        cupcake.setBaseFlavour(BaseFlavour.RED_VELVET);
        assertThat(cupcake.getBaseFlavour()).isEqualTo(BaseFlavour.RED_VELVET);
    }

    @Test
    public void isGlutenFreeTest()
    {
        assertThat(cupcake.isGlutenFree()).isEqualTo(true);
    }

    @Test
    public void getIcingFlavourTest()
    {
        assertThat(cupcake.getIcingFlavour()).isEqualTo(IcingFlavour.LEMON_BUTTERCREAM);
    }

    @Test
    public void setIcingFlavourTest()
    {
        cupcake.setIcingFlavour(IcingFlavour.VANILLA_BUTTERCREAM);
        assertThat(cupcake.getIcingFlavour()).isEqualTo(IcingFlavour.VANILLA_BUTTERCREAM);
    }

    @Test
    public void getToppingTest()
    {
        assertThat(cupcake.getTopping()).isEqualTo(Topping.SPRINKLES);
    }

    @Test
    public void setToppingTest()
    {
        cupcake.setTopping(Topping.MARSHMALLOWS);
        assertThat(cupcake.getTopping()).isEqualTo(Topping.MARSHMALLOWS);
    }

    @Test
    public void getIsHealthyTest()
    {
        assertThat(cupcake.isHealthierOption()).isEqualTo(true);
    }

}