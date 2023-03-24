@AddRole
Feature: User add the role
@Testcase1
Scenario: User creates the new role
  Given  User login successfully
  When User clicks on the admiin role page
  Then User clicks on the add role button
  Then User enters the rollname 'ad' click on the save button
  Then Verify the added roles in list 'ad'