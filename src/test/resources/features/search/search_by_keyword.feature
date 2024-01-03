Feature: Search by keyword

  @green
  Scenario: Searching for 'green'
    Given Sergey is researching things on the internet
    When he looks up "green"
    Then he should see information about "green"

  @red
  Scenario: Searching for 'red'
    Given Sergey is researching things on the internet
    When he looks up "red"
    Then he should see information about "red"

  @yellow
  Scenario: Searching for 'yellow'
    Given Sergey is researching things on the internet
    When he looks up "yellow"
    Then he should see information about "yellow"

  @blue
  Scenario: Searching for 'blue'
    Given Sergey is researching things on the internet
    When he looks up "blue"
    Then he should see information about "blue"

  @pink
  Scenario: Searching for 'pink'
    Given Sergey is researching things on the internet
    When he looks up "pink"
    Then he should see information about "pink"
