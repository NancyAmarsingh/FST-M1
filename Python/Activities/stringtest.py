# Strings how to mention in Python 

""" Python Strings"""

print("Practice Session for Strings")

#Assign string to a variable 

a = "String getting Stored in a variable"
print(a)
b =""" Big Paragraph can be written as comments inside 3 quotes"""
print(b)

# Strings work like Array 
print(b[10])

# Slicing the String 

print(b[10:19])

#Length of string
print(len(b))

print(a.lower())
print(a.upper())
#Python is case sensitive 

print(a.replace("a","Z"))
c="NANCY AMARSINGH.A"
print(c.split(","))

# Words present in string or not 

true = "NANCY" in c
true1 = "B" not in c
false = "AMARSINGH" not in c

print("Nancy present in" + format(c) + format(true))
print(true1)
print(false)


# format we can have unlimited number of arguments , index number to place more arguments

arg1 = 32
arg2 = 10 
arg3 = "I am {} yrs old and have {} yrs of experience"
print(arg3.format(arg1,arg2))

arg4 = "I am {1} yrs old and have {0} yrs of experience"
print(arg4.format(arg2,arg1))

	
username = input("Enter username:")
print("Username is: " + username)
