"""LN = ['1','2','3','4','5','6']
sum = 0
for x in LN:
 sum = sum + int(x)

print(sum)"""

numbers = list(input("enter comma seperated numbers:").split(','))
sum = 0
 
for number in numbers:
  sum += int(number)
 
print(sum)