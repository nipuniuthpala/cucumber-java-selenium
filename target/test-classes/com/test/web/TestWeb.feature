@Test_Web
Feature: Assignment testing.
  web site assignment.


  @test
  Scenario: Validate Website
    Given I am on the Home Page "http://the-internet.herokuapp.com/" of heroku Website
    When I select AB Test link
    Then I validate the heading
    And I click back
    And I select dropdown and select option1
    And I click back
    And I click on Frames
    Then I see the hyperlinks

