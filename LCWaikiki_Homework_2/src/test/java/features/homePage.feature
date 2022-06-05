@HomePage
Feature: Home Page

  @Test
  Scenario: Check Login Page
    Given Taha is on Home page
    When write "erkek ayakkabı" to SearchBox
    When click SearchButton
    When check SearchPage
    When click "Baskılı Bağcıklı Erkek Spor Ayakkabı" product item
    When Check Product Page
    When Select "41" size
    When Click "SEPETE EKLE" button
    Then See added product in basket count "1"


