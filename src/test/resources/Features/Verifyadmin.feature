@VerifyAdmindetails
Feature: Verify the admin details
@Testcase1
Scenario: Verify the admin details
  Given  User do the login successfully
  When User go to the admiin user screen
  And User select the branch code "1006" form the dropdown
  And User clicks on the action and select "view" form the list
  Then Verify the name "PALASA (DIST SRIKAKULAM)"