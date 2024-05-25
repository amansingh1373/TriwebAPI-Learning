#making a calculator
import os

def add(x,y):
    return x+y

def sub(x,y):
    return x-y

def mul(x,y):
    return x*y

def div(x,y):
    return [x/y, x // y, x%y]

while 1:
    os.system('cls')
    print("Choose operation:")
    print("1. Add")
    print("2. Subtract")
    print("3. Multiply")
    print("4. Divide")
    print("5. Exit")
    print("Enter your choice:")
    userInput = int(input())
    print("Enter two numbers:")
    x = int(input())
    y = int(input())
    match userInput:
        case 1:
            print(add(x,y))
        case 2:
            print(sub(x,y))
        case 3:
            print(mul(x,y))
        case 4:
            print(div(x,y)[0],div(x,y)[1],div(x,y)[2])
        case 5:
            break
print("Exiting the program")
            

    