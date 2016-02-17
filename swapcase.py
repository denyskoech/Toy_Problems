
def SwapCase(str):
    res=[]
    for x in range(len(str)):
        if(str[x].isupper()):
            res.append(str[x].lower())
        elif(str[x].islower()):
            res.append(str[x].upper())
        else:
            res.append(str[x])
    print("".join(res))
    #return "".join(res)
    
SwapCase('stop it guys')
