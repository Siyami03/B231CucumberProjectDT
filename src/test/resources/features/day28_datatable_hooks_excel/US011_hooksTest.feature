@US011
Feature: US011 Google Testi

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
    Then sayfa basliginin "toyoota" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir

  @volvo
  Scenario: TC03 Google sayfasinad Arama kutusunda arac aratilir

    Given kullanici "https://google.com" sayfasina gider
    When arama kutusunda "volvo" aratilir
    Then sayfa basliginin "volvo" icerdigini test eder
    But kullanici 3 saniye bekler
    And sayfayi kapatir