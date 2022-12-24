Feature: Search functionality

  As a user I am able to search the car

  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on "buy+sell" tab
    And I click "Search Cars" link
    Then I naviage to " new and used car search" page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in result
    Examples:
      | make          | model       | location          | price   |
      | Ford          | Focus       | WA - Perth        | $5,000  |
      | Ford          | Territory   | NSW - Sydney      | $3,000  |
      | Audi          | A5          | VIC - Melbourne   | $20,000 |
      | Land Rover    | Range Rover | VIC - Geelong     | $25,000 |
      | Kia           | RIO         | QLD - Gold Coast  | $5,000  |
      | Kia           | Sportage    | NSW - New England | $3,000  |

    Scenario Outline: Search the used car with model
      Given I am on homepage
      When I mouse hover on "buy+sell" tab to find used car
      And I click button which is below search cars"used"
      Then I navigate to "Used Cars For Sale" page where used cars can be found
      And I select make "<make>" from the drop down menu
      And I select model"<model>" from the drop down menu
      And I select locatoin "<location>" from the drop down menu
      And I select price "<price>" from the drop down menu
      And I click on Find My Next Car tab to find used car
      Then I should see the make "<make>" in results as per my preference
      Examples:
        |   make        |model        |location          |price    |
        | Ford          | Escort      | WA - Perth        | $5,000  |
        | Nissan        | Qashqai     | NSW - Sydney      | $10,000 |
        | Peugeot       | Expert      | VIC - Melbourne   | $3,000  |
        | Volkswagen    | Golf        | VIC - Geelong     | $7,500  |
        | Toyota        | Tiara       | QLD - Gold Coast  | $5,000  |
        | Jaguar        | XE          | NSW - New England | $30,000 |
