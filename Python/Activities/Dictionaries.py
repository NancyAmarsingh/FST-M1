## Cury braces with Key and Pair values 

Test_DICT = {
    "Name" : "Nancy",
    "age": 32,
    "Place" : "Chennai"

}
print(Test_DICT)
print(Test_DICT["age"])
print(Test_DICT.get("age"))
Test_DICT["age"] = 31
print(Test_DICT)
for x in Test_DICT:
    print(Test_DICT[x]) ##print values
    print(x) ##print Keys
for x in Test_DICT.values():
    print("using Values() function:",x) ## Items function to print both using loop
for x,y in Test_DICT.items():
    print(x,y)    

print(len(Test_DICT))    