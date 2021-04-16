#Will generate a list of 100 random numbers, then pick the first number
#in that list as our target number (since it's random that num can be anywhere)
#Sort the list, then search for that target number.
import random

#list=[random.randint(...)] but I didn't

numberList = []
for i in range(0, 100):
    n = random.randint(1, 100)
    numberList.append(n)

target = numberList[0]
#I forget python has fancy formatted strings
print('Target is: {0}'.format(target));

def quicksort(array):
    if(len(array) > 1):
        index = int(len(array)/2)
        pivot = array[index]
        #now create the other arrays and append
        left = [i for i in array if i < pivot]
        center = [i for i in array if i == pivot]
        right = [i for i in array if i > pivot]

        result = quicksort(left) + center + quicksort(right)
        return result
    else:
        return array

print(numberList)
sortedList = quicksort(numberList);
print("Sorted list:\n")
print(sortedList)

#Now that we have a target and a random list of numbers we can search for it
#Divisions means how many times we divide the list in our search
#the fewer times the better
rawSearch = 0
divisions = 0
isFound = False

print('Iteration:')
for num in sortedList:
    if num != target:
        rawSearch = rawSearch + 1
    else:
        print('We\'ve found it!  Only took {0} tries!'.format(rawSearch))
        break
##Now our search
print('Binary:')
while(isFound == False):
    index = int(len(sortedList)/2)
    pivot = sortedList[index]
    print('Pivot is: {0}'.format(pivot))
    if(pivot == target):
        print('We\'ve found it!  Only took {0} tries!'.format(divisions))
        isFound = True
    elif(target > sortedList[index]):
        sortedList = sortedList[index:] #magic [ython slicing
        divisions = divisions + 1
    else:
        sortedList = sortedList[:index]
        divisions = divisions + 1
