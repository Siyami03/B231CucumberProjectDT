
@US005
Feature: US005 Google Testi

  Scenario: TC01 Google sayfasinda arama kutusunda arac aratilir
      Given kullanici "https://google.com" sayfasina gider
      When google arama kutusunda "ford" aratilir
      Then sayfa basliginin "ford" icerdigini test eder
      But kullanici 2 saniye bekler
      And sayfayi kapatir


  Scenario: TC02 Google sayfasinda arama kutusunda arac aratilir
      Given kullanici "https://google.com" sayfasina gider
      When google arama kutusunda "volvo" aratilir
      Then sayfa basliginin "volvo" icerdigini test eder
      But kullanici 2 saniye bekler
      And sayfayi kapatir

  Scenario: TC03 Google sayfasinda arama kutusunda arac aratilir
      Given kullanici "https://google.com" sayfasina gider
      When google arama kutusunda "toyota" aratilir
      Then sayfa basliginin "toyota" icerdigini test eder
      But kullanici 2 saniye bekler
      And sayfayi kapatir