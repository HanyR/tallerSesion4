Feature:WhenDoClean

  @TestTaller
  Scenario: As a simple user
            I want to create a reminder
            To saved and be notified

    Given I have access to WhenDo App
    When I select the add button
    And I select the reminder button
    And I select data to create the reminder
    And I add the title "Title2" and the note "This is my note"
    And I select the save button
    Then the title "Title2" and the note "This is my note" should be displayed in my list

