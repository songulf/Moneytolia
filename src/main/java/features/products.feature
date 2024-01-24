Feature: Add products to cart


  @Test
  Scenario: Add products

    When Launch browser
    When Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    And Click 'Products' button
    And Hover over first product and click 'Add to cart'
    And Click 'Continue Shopping' button
    And Hover over second product and click 'Add to cart'
    And Click 'View Cart' button
    Then Verify both products are added to Cart
   