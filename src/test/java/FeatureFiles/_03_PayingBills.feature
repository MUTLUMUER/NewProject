Feature: Paying bill functionality

  Background: Login with valid username and password
    Given Navigate to Parabank
    When Enter username and password click login button
    Then User should login successfully

  Scenario Outline: User pays electricity, gas and water bills
    Given Navigate to bills' page
    When Pay the different types of bills
      | payName          | <name>          |
      | payAddress       | <address>       |
      | payCity          | <city>          |
      | payState         | <state>         |
      | payZipCode       | <zipcode>       |
      | payPhoneNumber   | <phonenumber>   |
      | payAccount       | <account>       |
      | payVerifyAccount | <verifyaccount> |
      | payAmount        | <amount>        |


    And Check payment status
    Then User should confirm bills are paid and the payment list is up to date
    Examples:
      | name                     | address   | city     | state   | zipcode | phonenumber | account | verifyaccount | amount |
      | enerjisa electricty bill | çengelköy | istanbul | türkiye | 34000   | 963869843   | 63462   | 63462         | 85     |
      | iski water bill          | fethiye   | muğla    | türkiye | 34000   | 963869843   | 63462   | 63462         | 45     |
      | igdaş gas bill           | seyhan    | adana    | türkiye | 34000   | 963869843   | 63462   | 63462         | 140    |