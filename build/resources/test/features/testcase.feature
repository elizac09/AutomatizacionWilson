Feature: Verify that when you enter the new web page

  Background: access to web site
    Given that Wilson wants to access on Web Automation Demo Site

    @tag0
    Scenario Outline: The user Wilson wants to check in on the page Web Automation Demo Site, so he can have permissions on the page.
    When he will check in on the page
      |firstName  |lasName   |email             |phone      |gender   |country    |year |month  |day  |password   |
      |wbedoya    |Londres   |waboaa@gmail.cpom |0342642399 |Man      |Austria    |1985 |May    |18   |ASD123456asd |
    Then He will check on the screen,  it loads the text Double Click on Edit Icon to EDIT the Table Row
    |answer                                            |
    |- Double Click on Edit Icon to EDIT the Table Row.|
    Examples:
      |firstName  |lasName   |email             |phone      |gender |country   |answer                                             |
      |wbedoya    |Londres   |waboaa@gmail.cpom |0342642399 |1      |Austria   |- Double Click on Edit Icon to EDIT the Table Row. |

    @tag1
    Scenario Outline: The user Wilson wants to delete a date.
      When he looks for a date
        |firstName  |lasName   |email             |phone      |gender |country   |answer                                             |
        |wbedoya    |Londres   |dsfaas@gmail.com |0342642399 |1      |Austria   |- Double Click on Edit Icon to EDIT the Table Row. |
      And he select the option Delete with right click
      Then He will check on the screen, the date do not exist
        |firstName  |lasName   |email             |phone      |gender |country   |answer                                             |
        |wbedoya    |Londres   |dsfaas@gmail.com |0342642399 |1      |Austria   |- Double Click on Edit Icon to EDIT the Table Row. |
      Examples:
        |firstName  |lasName   |email             |phone      |gender |country   |answer                                             |
        |wbedoya    |Londres   |dsfaas@gmail.com |0342642399 |1      |Austria   |- Double Click on Edit Icon to EDIT the Table Row. |

