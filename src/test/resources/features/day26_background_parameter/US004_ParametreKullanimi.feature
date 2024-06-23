@US004
Feature: US003 Amazon testi

  Background:
    Given kullanici "https://amazon.com" sayfasina gider

  Scenario: TC01 arama kutusunda iphone aratilir
    When arama kutusunda "iphone" aratir
    And sayfayi kapatir

  Scenario: TC02 arama kutusunda nokia aratilir
    When arama kutusunda "nokia" aratir
    And sayfayi kapatir

  Scenario: TC03 arama kutusunda selenium aratilir
    When arama kutusunda "selenium" aratir
    And sayfayi kapatir


# Feature file i daha dynamic hale getirmek icin gitmek istedigimiz url yada aratmak istedigimiz bir ifadeyi
# ""(cift tirnak) icine belirtebilirit, cunku tirnak icinde yazdigimiz ifade artik stepdefiniton classindaki
# methodta bir parametreye dönüsür, böylece tekrar tekrar method olusturmadan istedigimiz url e gidebilir
# ya da istedigimiz kelimeyi aratabiliriz