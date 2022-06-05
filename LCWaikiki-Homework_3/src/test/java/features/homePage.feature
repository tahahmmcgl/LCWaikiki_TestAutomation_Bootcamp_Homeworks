@HomePage
Feature: Home Page

  @Test
  Scenario: Check Login Page
    Given Enes is on Home page
    When click "Giriş Yap" card in the top right
    Then should see Login Page

