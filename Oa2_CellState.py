#Solution to https://aonecode.com/amazon-online-assessment-oa2-cell-state-after-n-days

numDays = 2;
passedDays = 0;
base = [1, 1, 1, 0, 1, 1, 1, 1];
altered = base.copy();

def getNewBit(x, y):
    if x == y:
        return 0;
    else:
        return 1;

while(passedDays < numDays):
    index = 0;
    for num in base:
        if index == 0:
            altered[index] = getNewBit(0, base[index + 1]);
        elif index == len(base)-1:
            altered[index] = getNewBit(base[index - 1], 0);
        else:
            altered[index] = getNewBit(base[index - 1], base[index + 1]);
        index += 1;
    base = altered.copy();
    print(altered, ' day:', passedDays);
    passedDays += 1;
