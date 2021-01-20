package week12d02;

import org.junit.Test;



import static org.junit.Assert.assertEquals;
import static week12d02.Fence.*;

public class StreetTest {


    @Test

    public void test1(){

        Street street = new Street();

        street.sellSite(new Site(0, 10, PERFECT));
        street.sellSite(new Site(0, 7,  NEED_UPGRADE));
        street.sellSite(new Site(1, 12, NEED_UPGRADE));
        street.sellSite(new Site(0, 9, PERFECT));
        street.sellSite(new Site(0, 11, NO_FENCE));
        street.sellSite(new Site(1, 13, PERFECT));

        assertEquals(3, street.getLasHouseNumber());
        assertEquals("[PERFECT : 3, NEED_UPGRADE : 2, NO:FENCE : 1]", street.sitesByFence());

    }
}
