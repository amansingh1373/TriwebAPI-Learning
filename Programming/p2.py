print("enter the maximum number of lines in the store:")
max = int(input())
i = 1
while(i < 2 * max):
    if(i <= max):
        j = 1
        while(j <= i):
            print("*", end = "")
            j += 1
    else:
        j = max - (i - max)
        while(j > 0):
            print("*", end = "")
            j -= 1
    print()
    i += 1