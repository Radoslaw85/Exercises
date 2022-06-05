Feature: Logging in to the created user

  Scenario Outline: Address changing
    Given User have created an account on "https://mystore-testlab.coderslab.pl" website
    When User click Sign in
    And Fill email and password and click on SIGN IN button
    And Click addresses and create new address
    And User fill necessary fields "<alias>", "<address>", "<city>", "<postal_code>", "<country>", "<phone>"
    Then New address will be created
    And User will check if all added date are correct
    And User will remove added address and check if its deleted
    And Browser is closed

    Examples:
      | alias      | address                    | city    | postal_code  |  country            |  phone      |
      | Terminator | ulica Robotyki  5 /56      | Mars    | 66-666       | United Kingdom      | 500 600 700 |



