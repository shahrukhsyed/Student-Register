Feature: Demo Page

  Scenario: Invalid Student Name
    Given User is on 'Registration' Page
    When user enters invalid Name
    Then display 'Please Enter Name'

  Scenario: Invalid Student Gender
    Given User is on 'Registration' Page
    When user enters invalid gender
    Then display 'Please Enter Gender'
    
       Scenario: Invalid Student Bike
    Given User is on 'Registration' Page
    When user enters invalid Bike
    Then display 'Please Enter Bike'
    
      Scenario: Invalid Student DOB
    Given User is on 'Registration' Page
    When user enters invalid dob
    Then display 'Please Enter DOB'
  

  Scenario: Valid Student details
    Given User is on 'Registration' Page
    When User enters valid student details
    Then displays 'Student Register Successfully!'
