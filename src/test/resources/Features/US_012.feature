@smoke
Feature:Choose product and see detail information

  Background: User opens the app
    * User makes driver adjustments

  Scenario Outline: Choose product and see detail information

    * Click first product from home page
    * Verifies the visibility of first product "<section>" button on the home page and the visibility of the text "<content>" on the page by clicking it

    Examples:
      |section               |content          |
      |Details               |Product Details  |
      |Videos                |Product Videos   |
      |Review                |Product Reviews  |
      |Shipping & Return     |Shipping & Return|