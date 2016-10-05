Feature: User Registration Testing

  Scenario: Save User
    Given a user
    When call save
    Then user saved