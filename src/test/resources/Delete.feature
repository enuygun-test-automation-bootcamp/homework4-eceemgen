Feature:
  @Delete
  Scenario: Successfully Deleting
    When User Deletes
    Then Delete message should be "User deletes successfully"
    And Return response status is 404
