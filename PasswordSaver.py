import csv
import sys

#The password list - we start with it populated for testing purposes
passwords = [["yahoo","XqffoZeo"],["google","CoIushujSetu"]]


#The password file name to store the passwords to
passwordFileName = "samplePasswordFile"

#The encryption key for the caesar cypher
encryptionKey = 16

#Caesar Cypher encryption
def passwordEncrypt (unencryptedMessage, key):

    #We will start with an empty string as our encryptedMessage
    encryptedMessage = ''

    #For each symbol in the unencryptedMessage we will add an encrypted symbol into the encryptedMessage
    for symbol in unencryptedMessage:
        if symbol.isalpha():
            num = ord(symbol)
            num += key

            if symbol.isupper():
                if num > ord('Z'):
                    num -= 26
                elif num < ord('A'):
                    num += 26
            elif symbol.islower():
                if num > ord('z'):
                    num -= 26
                elif num < ord('a'):
                    num += 26

            encryptedMessage += chr(num)
        else:
            encryptedMessage += symbol

    return encryptedMessage

def loadPasswordFile(fileName):

    with open(fileName, newline= '') as csvfile:
        passwordreader = csv.reader(csvfile)
        passwordList = list(passwordreader)

    return passwordList

def savePasswordFile(passwordList, passwordFileName):

    with open(passwordFileName, 'w+', newline='') as csvfile:
        passwordwriter = csv.writer(csvfile)
        passwordwriter.writerows(passwordList)



while True:
    print("What would you like to do:")
    print(" 1. Open password file")
    print(" 2. Look up a password")
    print(" 3. Add a password")
    print(" 4. Delete a password")
    print(" 5. Save password file")
    print(" 6. Print the encrypted password list (for testing)")
    print(" 7. Quit program")

    print("Please enter a number (1-5)")
    choice = input()

    if(choice == '1'): #Load the password list from a file
        passwords = loadPasswordFile(passwordFileName)

    #assignment starts here - insert your own code

    if(choice == '2'): #Look up at password
        print("Which website do you want to look up the password for?")
        for keyvalue in passwords:
            print(keyvalue[0])
        passwordToLookup = input()

        for sublist in passwords: #loops through sublists in passwords list
           if passwordToLookup in sublist:
                #reverses encryptionKey in function for list index that goes with passwordToLookup
                decryptedPassword = passwordEncrypt(sublist[1], -encryptionKey)
                print(decryptedPassword)


    if(choice == '3'): #add password
        print("What website is this password for?")
        website = input()
        print("What is the password?")
        unencryptedPassword = input()

        encryptedPassword = passwordEncrypt(unencryptedPassword, encryptionKey) #calls passwordEncrypt function
        newPasswordList = [website, encryptedPassword] #creates new list from website and encryptedPassword input
        passwords.append(newPasswordList) #adds newPasswordList to original passwords list

    if(choice == '4'): #delete password
        print("What site would you like to delete the password for?")
        for keyvalue in passwords:
            print(keyvalue[0])
        passwordToDelete = input()

        for sublist in passwords: #loops through sublists in passwords list
            if passwordToDelete in sublist:
                passwords.remove(sublist) #removes sublist containing passwordToDelete site and its password
                print("That site and password have been deleted.")

    #Assignment ends here

    if(choice == '5'): #Save the passwords to a file
        savePasswordFile(passwords, passwordFileName)

    if(choice == '6'): #Print out the password list
        for keyvalue in passwords:
            print(', '.join(keyvalue))

    if(choice == '7'): #Quit the program
        sys.exit()


    print()
    print()

