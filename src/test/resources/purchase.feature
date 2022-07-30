Feature:
  @FindPurchase
  Scenario: Successfull Finding Purchase
    When User Finds Purchase by ID request
    Then Finding Purchase message should be "User found purchase successfully"
    And Finding response status is 200
