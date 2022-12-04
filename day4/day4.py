

def pairs(line):
    range1=line[0].split("-")
    range2=line[1].split("-")
    list1=[*range(int(range1[0]),int(range1[1])+1,1)]
    list2=[*range(int(range2[0]),int(range2[1])+1,1)]
    
    if (int(range2[0]) in list1) or (int(range2[1]) in list1) or (int(range1[0]) in list2) or (int(range1[1]) in list2):
        return 1
    return 0




if __name__ == "__main__":
    sum=0
    n=0
    with open("day4/data_day_4.txt","r") as file:
        for line in file:
            line=line.strip("\n")
            sum+=pairs(line.split(","))

    file.close()
    print(sum)