#TASK:
# 3 tane Scenario oluşturunuz
# Amazon sayfasında iphone, samsung ve nokia aratınız.

@US003
Feature: US003 Amazon testi

  Background:
    Given kullanici amazon sayfasina gider

  @iphone
  Scenario: TC01 arama kutusunda iphone aratilir
    When arama kutusunda iphone aratir
    And sayfayi kapatir

  @samsung @nokia
  Scenario: TC02 arama kutusunda samsungu aratilir
    When arama kutusunda samsung aratir
    And sayfayi kapatir

  @nokia
  Scenario: TC03 arama kutusunda nokia aratilir
    When arama kutusunda nokia aratir
    And sayfayi kapatir

# Eger feature file da kullanacağımız senaryolarda ortak adimlar var ise Feature keywordunden
# sonra Background yazarak burada başlangıç için ortak adimlari belirtebiliriz
# Backgound yapisi @BeforeMethod mantigi ile calisir
