import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class  BonusServiceTest{
    @Test
    public void test() {

        BonusService service = new BonusService();

        int expected = 140;
        int actual = service.calcBonus(5_000, true);
        //System.out.println("1. " + expected + "== ? == " + actual);

        Assertions.assertEquals(expected, actual);

    }
}
