@US013
Feature: US013 Google Testi rerun failed scenarios

  @ford
  Scenario: TC01 Google sayfasinad Arama kutusunda arac aratilir

    Given kullanici "https://google.com" sayfasina gider
    When arama kutusunda "ford" aratilir
    Then sayfa basliginin "ford" icerdigini test eder
    But kullanici 1 saniye bekler
    And sayfayi kapatir

  @toyota
  Scenario: TC02 Google sayfasinad Arama kutusunda arac aratilir

    Given kullanici "https://google.com" sayfasina gider
    When arama kutusunda "toyota" aratilir
    Then sayfa basliginin "toyota" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir

  @volvo
  Scenario: TC03 Google sayfasinad Arama kutusunda arac aratilir

    Given kullanici "https://google.com" sayfasina gider
    When arama kutusunda "volvo" aratilir
    Then sayfa basliginin "volvo" icerdigini test eder
    But kullanici 3 saniye bekler
    And sayfayi kapatir