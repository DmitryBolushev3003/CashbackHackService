import org.junit.Assert;
import org.junit.Test;
import service.CashbackHackService;

public class jUnit4Test {

    @Test
    public void showMeHowMuchToCashbackFrom1000Test(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void showMeHowMuchToCashbackFrom999Test(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void showMeHowMuchToCashbackFrom1001Test(){
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expected = 999;
        Assert.assertEquals(expected, actual);
    }


}
