package tests;

import org.junit.jupiter.api.Test;
import pages.YandexPage;

public class YandexSearchTest {

    @Test
    void searchInRussian() {

        new YandexPage()
                .openPage()
                .enterSearchText("работает ли строка поиска?")
                .clickSearchButton()
                .shouldSeeSearchResults();
    }

    @Test
    void searchInEnglish() {

        new YandexPage()
                .openPage()
                .enterSearchText("does search work")
                .clickSearchButton()
                .shouldSeeSearchResults();
    }
}