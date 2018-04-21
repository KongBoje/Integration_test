# Integration_test

I'm using the Glarmester_solution project for this assigment

## Strategy for Integration testing

So in this project I primarily focus on the testing of the database integration.

While only focusing on the integration testing of the database, I'm going to use the big bang strategy, since it makes most sence for this project because it's small and already implemented.

## Test cases

| Test case ID        | Test case objective              | Test case description               | Expected result |
| --------------------|:--------------------------------:|:-----------------------------------:| ---------------:|
| 1                   | Check connection to the database | Get price from glass                | 300             |
| 2                   | Check database interactions      | Get prices for the three frametypes | 100/200/350     |

## Additional test
Since the calculation of price is one of the main functionalities in this project, it only makes sence to also test on the calculatePrice method.
