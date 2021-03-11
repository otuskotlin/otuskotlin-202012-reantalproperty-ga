import org.junit.Test;
import org.junit.Assert.*;

public class Main {
    @Test
   public void moneyTest() {
        Money money = new Money(10.0, "Rub");
        org.junit.Assert.assertEquals(money, new Money(10.0, "Rub"));
    }
}
