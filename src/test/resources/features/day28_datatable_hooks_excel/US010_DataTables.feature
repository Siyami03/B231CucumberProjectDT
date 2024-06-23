@US010
Feature: US010 BlueRentalCar sayfasinda login islemi
  Scenario: TC01 Verilen Email ve Password bilgileri ile login olunur
    Given kullanici blueRentalCar sayfasina gider
    When login butonuna tiklar
    And verilen kullanici bilgileri ile login olur
      | email                         | password |
      | sam.walker@bluerentalcars.com | sami     |
      | john_doe@gmail.com            | johndoe  |
      | johnson@bluerentalcars.com    | johnson  |
    And sayfayi kapatir