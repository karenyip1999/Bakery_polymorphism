import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;

public class BakeryTest {

    private Bakery bakery;

    @BeforeEach
    public void setUp()
    {
        bakery = new Bakery();
    }

    @Test
    public void canCountCakesTest()
    {
        assertThat(bakery.countCakes()).isEqualTo(0);
    }

    @Test
    public void canAddCakesTest()
    {
        Cake cake = new Cupcake("sponge cake", BaseFlavour.VANILLA, true, IcingFlavour.LEMON_BUTTERCREAM, Topping.SPRINKLES, true);
        bakery.addCake(cake);
        assertThat(bakery.countCakes()).isEqualTo(1);
    }
}
