@regression @addcart
Feature: Validate customer is able to add items in the shopping cart and compare the product

  Scenario: Validate user is able to add dresses in the shopping cart
    Given User open automationpractice website

    Then user is able to click on the "Summer Dresses" menu from the "Dresses" menu
    Then user is able to see the summer dresses

    Then user clicks "Add To Cart" button for one summer dress
    Then user is able to see and click the "Proceed To Checkout" button on the status dialog

    Then user validates the "Product Name", "Product Color" and "Product Qty" on the "Shopping cart summary" page