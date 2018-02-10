exponent = 0 #defines exponent
for count in range(0,100,2**exponent): #starts for loop, defines range
    exponent = exponent + 1 #defines exponent for use in for loop
    count = 2**exponent #sets count variable to 2 raised to the power of exponent + 1, loops until exponent = 100
    print(count) #prints 2^1, 2^2, etc. until 2^100
