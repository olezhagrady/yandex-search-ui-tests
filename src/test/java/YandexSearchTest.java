import org.junit.jupiter.api.Test;

public class YandexSearchTest {

    @Test
    void searchInYandex() {
        new YandexPage()
                .openPage()
                .enterSearchText("работает ли строка поиска?")
                .clickSearchButton()
                .shouldSeeSearchResults();
    }
}