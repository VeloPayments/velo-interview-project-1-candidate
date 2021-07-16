
# Velo Interview Project 1
### By Velo Payments, July 2021

## Overview
We'd like you to create a Spring Boot Application to play games of Noughts and Crosses aka Tic Tac Toe.  
The idea is to show us your coding and design skills, and give us some code to discuss in the walkthrough interview. 

  
The repo you've cloned gives you a starting point, and various TODO markers are in place for you to fill in the gaps.  
We'd like to see what production logic you put in place, and also the tests you decide to implement.  

The main functionality to cover is:

### New game: 	POST /games

- Create a new game and return a new unique game id

### Make move:  POST /games/{gameId}/moves  
- Make a move in an existing game, and return the new game board state.    
- This will be called multiple times for a particular game, once per move.  
- Implementing win logic is not mandatory.

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
