@MainPageFeature
Feature: MainPageTest
  test

  Scenario: Test text description
    When I open site "https://dnipro.ithillel.ua/"
    Then Text description button must equals "Вдосконалюйся!"
