package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import static helpers.TestData.*;
import static base.HomePage.*;

public class HomePageTest extends BaseTest {

    @Test
    public static void asUserIWouldLikeTosearchForHotelsInHaniaGreece() {
        //clickBtnAcceptIfIsVisible();
        provideTheLocationSearchBox(CITY_HANIA);
        pickStartAndEndDate();
        clickBtnSearch();
        checkThatDestinationHasBeenFound();
    }

}
