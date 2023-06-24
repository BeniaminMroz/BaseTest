package base;

import com.codeborne.selenide.SelenideElement;
import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    private static SelenideElement btnAccept = $("[id='onetrust-accept-btn-handler']");
    private static SelenideElement locationSearchBox = $("[name='ss']");
    private static SelenideElement btnZameldowanie = $("..d606c76c5a");
    private static SelenideElement startDate = $("[data-date='2023-07-26']");
    private static SelenideElement endDate = $("[data-date='2023-07-28']");
    private static SelenideElement btnSearch = $("button[type='submit']");
    private static SelenideElement destinationHasBeenFound = $("#s2id_autogen10 .select2-chosen");

    public static boolean clickBtnAcceptIfIsVisible() {
        try {
            btnAccept.shouldBe(visible, Duration.ofMillis(5000));
            btnAccept.click();
        } finally {
            return false;
        }
    }

    public static void provideTheLocationSearchBox(String location) {
        //btnAccept.shouldBe(visible, Duration.ofMillis(10000));
        sleep(5000);
        btnAccept.click();
        locationSearchBox.shouldBe(visible, Duration.ofMillis(2000));
        locationSearchBox.clear();
        locationSearchBox.sendKeys(location);
    }

    public static void pickStartAndEndDate() {
        btnZameldowanie.click();
        startDate.click();
        endDate.click();
    }

    public static void clickBtnSearch() {
        btnSearch.click();
    }

    public static void checkThatDestinationHasBeenFound() {
        destinationHasBeenFound.shouldHave(text("Chania: znaleziono "));
    }

}
