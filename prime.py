number=int(raw_input("Enter a number:"))
if number <= 1:
    print number, "is not prime"
else:
    a=2
    check = True
    while a != number:
        if number%a == 0:
            print number, "is not prime"
            check = False
            break
        a+=1
    if check == True:
        print number, "is a prime"
