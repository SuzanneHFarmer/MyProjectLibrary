listToPrint = [] #creates blank list
while True: #starts loop, continues while conditions in block are True
    newWord = input("Enter a word to add to the list (press return to stop adding words) > ") #gets direct user input
    if newWord == "": #evaluates if input field is blank
        break #breaks 'while' loop if input field is blank
    else: #evaluates if input field is not blank
        listToPrint.append(newWord) #adds input for newWord to listToPrint
print("Here is the list:") #prints once 'while' loop is broken
print(str(listToPrint[0:-1]) + ', and ' + str(listToPrint[-1]))
#line 9 prints string form of slice of listToPrint up to but not including the last index,
#concatenates string ', and ', then prints string form of last index of listToPrint
#I tried several different ways of formatting the printed output including:
#list.insert(-1, 'and')
#print(", ".join(map(str, list)))
#This is the closest I was able to get but I can't figure out how to remove the brackets in the [0:-1] slice
