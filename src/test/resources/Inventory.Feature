Feature:
  @ReturnInventoriesStatus
  Scenario: Successfully Returning Inventory by Status
    When User Returns Pet Inventories by Status
    Then Returning message should be "User returned pet inventory successfully"
    And Return response status is 200
