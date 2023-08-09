Feature: tutorial ninja
  Background:
  Given launch the browser  url "https://www.tutorialsninja.com/demo/"
    @register
    Scenario: To register the given application
      Given user click on register button
      When user start give input to all the asterick textfield
      And click on checkbox
      And click on continue
      Then validate user is created


    @register1
    Scenario Outline: To register the given application
      Given user click on register button
      When user enters firstname <fname> and lastname <lname> and email <email> Telephone <Tele> password <pass1> confpassword <confpass>
      And click on checkbox
      And click on continue
      Then validate user is created

      Examples:
      |fname|lname|email|Tele|pass1|confpass|
      |manu |gowda|mau123@gmail.com|998765432|123@qwe|123@qwe|
      |manu |gowda|mau1234@gmail.com|998765432|123@qwe|123@qwe|

