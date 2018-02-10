import sys

itemsInBackpack = ["book", "computer", "keys", "travel mug"] #lists starting items in backpack

while True: #starts while loop that lets user choose from input options infinite times
    print("Would you like to:") #presents options to user
    print("1. See what is currently in the backpack?")
    print("2. Add an item to the backpack?")
    print("3. Check if a specific item is in the backpack?")
    print("4. Remove an item from the backpack?")
    print("5. Quit")
    userChoice = input() #determines which option user picks

    if(userChoice == "1"): #runs this block if user inputs 1 for checking contents of backpack
        print(itemsInBackpack) #prints contents of list itemsInBackpack

    if(userChoice == "2"): #runs this block if user inputs 2 for adding to list
        print("What item do you want to add to the backpack?")
        itemToAdd = input() #gets item to add input from user
        itemsInBackpack.append(itemToAdd) #adds item to starting list
        print(itemToAdd + " added to backpack.") #confirms that user input has been added to list

    if(userChoice == "3"): #runs this block if user inputs 3 for checking specific item against list
        print("What item do you want to check to see if it is in the backpack?")
        itemToCheck = input() #gets itemToCheck input from user
        if itemToCheck not in itemsInBackpack: #checks input against list to see if item is included w/"not in" operator
            print("That item is not in the backpack.") #prints if input is not already in original/appended list
        else: #checks input against list to see if item is included, runs this block if item is in list
            print("That item is in the backpack.") #prints if input is already in starting/appended list

    if(userChoice == "4"): #runs this block if user inputs 4 for removing item
        print("What item do you want to remove from the backpack?")
        itemToRemove = input() #gets itemToRemove input from user
        if itemToRemove not in itemsInBackpack: #checks list to see if input is included w/"not in" operator
            print(itemToRemove + " is not in the backpack.") #prints if input is not already in starting/appended list
        itemsInBackpack.remove(itemToRemove) #removes item from list
        print(itemToRemove + " removed from the backpack.") #confirms removal of item

    if(userChoice == "5"): #runs this block if user inputs 5 for quitting the program
        sys.exit() #ends code

#still playing around with the code to see if I can keep the program from actually printing the Traceback text
#and ending the program if the user input causes a ValueError; only happens if user tries to remove an item
#not in the itemsInBackpack list
