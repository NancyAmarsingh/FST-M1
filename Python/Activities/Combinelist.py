fl = [19,24,33,56,71,89]
sl = [20,25,34,57,72,90]
tl = []
for fls in fl:
    if(fls%2 == 0):
       tl.append(fls)
for fls in sl:
    if(fls%2 != 0):   
       tl.append(fls)
	
print("result List is:")
print(tl)