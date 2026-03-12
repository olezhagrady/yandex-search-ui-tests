# Yandex Search UI Tests

Simple UI automation tests for Yandex search using:

- Java
- Selenide
- JUnit 5
- Maven
- Page Object Pattern

## Test cases

- openMainPage — verifies that the Yandex main page opens and the search field is visible
- searchInRussian — verifies that search works with a Russian query
- searchInEnglish — verifies that search works with an English query
- autocompleteSuggestionsAppear — verifies that search suggestions appear when typing in the search field

## Project structure

src/test/java/pages/YandexPage.java — Page Object for Yandex search page  
src/test/java/tests/YandexSearchTest.java — UI tests

## Run tests

Run tests using Maven:
