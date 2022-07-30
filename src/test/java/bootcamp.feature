Feature:
  @order
  Scenario: Successfull order
    When User adds an order request
    Then Order message should be "User ordered successfully"
    And Order response status is 200

