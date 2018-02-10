from random import randint
randomNum = randint(1,100) #sets randomNum to random integer between 1 and 100
print('Let\'s play a game.') # \ is escape character for '
print('Pick a number between 1 and 100.')
guess = int(input()) #gets input, converts to integer form
while guess != randomNum: #evaluates if guess does not equal randomNum, repeats while clause while True
        print('That\'s not it. Guess again.')
        guess = int(input()) #continues getting input in integer form while loop conditions are met
if guess == randomNum: #evaluates if guess equals randomNum, breaks while loop if true
        print('That\'s it! Lucky guess.')
