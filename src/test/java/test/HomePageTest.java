package tests;

import base.BaseTest;
import org.testng.annotations.Test;

import static helpers.TestData.*;
import static pageObjects.HomePage.*;

public class HomePageTest extends BaseTest {

    @Test
    public static void asUserIWouldLikeTosearchForHotelsInWroclaw() {
        provideTheLocationSearchBox(CITY_HANIA);
        clickOnZameldowanieBox();
        pickdate();
        checkThatCityHasBeenFoundInSearchBox(CITY_WROCLAW_IN_SEARCH_BOX);
    }
}