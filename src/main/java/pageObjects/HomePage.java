package pageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    private static SelenideElement txtLocationSearchBox = $(".c-autocomplete__input");
    private static SelenideElement lblZameldowanieBox = $(".sb-date-field__icon");
    private static SelenideElement date18Luty2021 = $$("td span span").findBy(text("18"));
    private static SelenideElement lblHighlightedSearchBoxElement = $("sb-searchbox__input");
    private static SelenideElement lblLocationSearchBoxText = $("#s2id_autogen10 .select2-chosen");

    public static void provideTheLocationSearchBox(String location) {
        txtLocationSearchBox.sendKeys(location);
    }

    public static void clickOnZameldowanieBox() {
        lblZameldowanieBox.click();
    }

    public static void pickdate() {
        date18Luty2021.click();
    }

    public static void checkThatCityHasBeenFoundInSearchBox(String location) {
        lblLocationSearchBoxText.shouldHave(text(location));
    }

}