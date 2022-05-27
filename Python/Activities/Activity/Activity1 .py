##Activity 1 

UserName  = input("Enter Name:")
Age = input("Enter Age:")
a = int(Age)
Agecalc =  100 - a
Yearcalc = 2022 + Agecalc
print("Hey " + format(UserName) + " U will turn 100 on this " +format(Yearcalc))

## Another Solution
	
name = input( "What is your name: " )
age = int( input( "How old are you: " ) )
year = str( ( 2022 - age ) + 100 )
print( name + " will be 100 years old in the year " + year )