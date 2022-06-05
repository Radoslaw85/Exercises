Feature: Shopping
  Scenario: User has an account and will try to buy something in the shop
    Given User will be on the website "https://mystore-testlab.coderslab.pl"
    When user will click SIGN IN button to log in
    And user will fill email and password field to log in
    And user click My Store
    And user will click on Hummingbird Printed Sweater and add size M and quantity five and click add to cart
    And user will click PROCEED TO CHECK OUT button
    And user will click again PROCEED TO CHECK OUT button
    Then user will confirm address and click on SHIPPING METHOD and will choose PrestaShop
    And user will click on PAYMENT tab and will choose Pay by Check method and click on order with an obligation to pay
    And Browser will be closed
    And user will check order details
    And user will check if order have status Awaiting check payment