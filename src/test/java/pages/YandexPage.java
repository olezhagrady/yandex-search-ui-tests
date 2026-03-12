package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class YandexPage {

    public YandexPage openPage() {
        open("https://ya.ru");
        return this;
    }

    public YandexPage enterSearchText(String text) {
        $("[name='text']").shouldBe(visible).setValue(text);
        return this;
    }

    public YandexPage clickSearchButton() {
        $("[type='submit']").shouldBe(visible).click();
        return this;
    }

    public YandexPage shouldSeeSearchResults() {
        webdriver().shouldHave(urlContaining("search"));
        return this;
    }
}