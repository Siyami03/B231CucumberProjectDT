@US012
Feature: US012 BlueRentalCar sayfasinda login islemi
  Scenario: TC01 Exceldeki email ve password bilgileri ile login olunur
    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    And exceldeki "admin_info" sayfasindaki kullanici bilgileri ile login olunur
    But kullanici 1 saniye bekler
    And sayfayi kapatir
