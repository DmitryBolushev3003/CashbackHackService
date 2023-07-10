import org.testng.annotations.Test;
import service.CashbackHackService;

import static org.testng.Assert.assertEquals;


public class TestNgService {


    @Test
    public void cashbackHackServiceNineTest ()
            //Тест при покупке на 999 рублей
    {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected = 1;
        assertEquals(expected, actual);

    }

    @Test
    public void cashbackHackServiceTwoThousandTest ()
    {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);

    }
    @Test
    public void cashbackHackServiceOneThousandTest ()
    {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);

    }
    @Test
    public void cashbackHackServiceNullTest ()
    {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);

    }
}