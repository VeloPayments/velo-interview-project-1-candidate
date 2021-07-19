
# Velo Interview Project 1
### By Velo Payments, July 2021

## Overview
We'd like you to create a Spring Boot Application to play games of Noughts and Crosses aka Tic Tac Toe.  
The idea is to show us your coding, design and documentation skills, and give us some code to discuss in the walkthrough interview.  

Note: There will be no AI or Computer player involved - the application should allow two human players to make moves and play a game. 
  
The repo you've cloned gives you a starting point, and various TODO markers are in place for you to fill in the gaps.  
We'd like to see what production logic you put in place, and also the tests you decide to implement.  

The main functionality to cover is:

### New game: 	POST /games

- Create a new game and return a new unique game id

### Make move:  POST /games/{gameId}/moves  
- Make a move in an existing game, and return the new game board state.    
- This will be called multiple times for a particular game, once per move.  
- Implementing win logic is optional, but you can attempt it if you have time.

## Submitting your solution
To submit your solution, please zip your project folder and email it to stuart.martin@velopayments.com

## Repo notes
The repo comes with an initial Spring Boot application, with a Controller and Service.  
"TODO" markers are in place to show where you need to fill in gaps in the code.  
You can use this or write your own, and add any new classes as required.  
To start up the application, please run the "VeloInterviewApplication" main block in your IDE.  
This should startup the application and listen on port 8080.  


Notes:
- The project is setup to use H2 database. We would normally only use this for testing, but it's OK to use that for runtime also for this exercise. 

## Testing
There are several ideas for test classes you may wish to write in the "src/test/java" folder.  
Please fill these out as needed, and add any others you may need.  
If you run out of time for the exercise, feel free to add TODO marker comments for extra test cases you'd like to cover


## Sample Curl commands

Your solution should be tested using Spring Boot tests, but you can also run the main application file and make requests with curl commands.  
e.g.

New game:
  
    curl -v -X POST http://localhost:8080/games/

Make move:  

    curl -v -X POST -d "{ \"key1\":\"value1\" }" -H "Content-Type: application/json" http://localhost:8080/games/e8d26f0a-18a0-414f-a3ac-edbbe2a6bc57/moves

- the game id here would need to be a valid gameId obtained from a 'new game' call
- the json in the body would need to match your chosen format for a move
