#https://editor.datatables.net adresine gidiniz
# Sayfadaki tabloda new butonuna basalım
# Çıkan pencerede verilen bilgileri girelim
# Create butonuna basalım
# Search bölümüne girdiğimiz firstname bilgisini girelim
# Başarılı bir şekilde giriş yapıldığını doğrulayalım
# Sayfayı kapatalım

#| john   | smith    | tester      | NYC     | 2134      | 2023-02-25 | 80000   |
#| sam    | walton   | businessman | LA      | 5262      | 2021-02-21 | 2000000 |
#| nancy  | brown    | developer   | Dallas  | 2346      | 2021-02-26 | 850000  |
#| george | smith    | politician  | Dallas  | 9931      | 2021-02-24 | 9850000 |
#| barry  | allen    | unknown     | Central | 2103      | 2021-02-23 | 1000000 |

@US008
Feature: US008 Data Driven Test

  Scenario Outline: TC01 Registeration Data Driven Test

    Given kullanici "https://editor.datatables.net" sayfasina gider
    When kullanici sayfadaki tabloda new butonuna basar
    And kullanici verilen bilgileri girer "<name>", "<lastName>", "<position>", "<office>", "<extension>", "<date>", "<salary>"
    And create butonuna basar
    And kullanici search bolumune "<name>" bilgisini girer
    Then kullanici "<name>" ile basarili bir kayit yapildigini dogrular
    And sayfayi kapatir

    Examples:
      | name   | lastName | position    | office  | extension | date       | salary  |
      | john   | smith    | tester      | NYC     | 2134      | 2023-02-25 | 80000   |
      | sam    | walton   | businessman | LA      | 5262      | 2021-02-21 | 2000000 |
      | nancy  | brown    | developer   | Dallas  | 2346      | 2021-02-26 | 850000  |
      | george | smith    | politician  | Dallas  | 9931      | 2021-02-24 | 9850000 |
      | barry  | allen    | unknown     | Central | 2103      | 2021-02-23 | 1000000 |