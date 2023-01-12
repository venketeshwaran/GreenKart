Feature: Online Shopping site

Scenario: Order online vegetables

Given User launch the url
When User click the search for vegetables box and send the "tomato"
And User click the add to cart button
And User click the items icon
And User click the proceed to checkout button
Then See page shown


Scenario: Place Order

When User Click enter a promo code
And User Click the apply button
And User Click the place order button

Scenario: Final page

When User select the Country
And User click the agree checkbox
And User click the proceed button
