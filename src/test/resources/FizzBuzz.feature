Feature: FizzBuzz Game play

Scenario: Play FizzBuzz to get Fizz
Given Create a FizzBuzz game play
When I play with number 3
Then The result is "Fizz"

Scenario: Play FizzBuzz to get Buzz
Given Create a FizzBuzz game play
When I play with number 5
Then The result is "Buzz"

@testcasekey=SPH-TC-981
Scenario Outline: Play FizzBuzz to get FizzBuzz
Given Create a FizzBuzz game play
When When I play with number <NumbertobeTested>
Then Then The result is "FizzBuzz"

  Examples:
    | NumbertobeTested  |
    | 30   |
    | 15   |
    | 45   |
