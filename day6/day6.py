def four_different(data):
    list=[]
    for i in range(0,14):
        list.append(data[i])
    place=len(list)+1
    while True:
        if len(list)==len(set(list)): 
            return place
        else:
            list.remove(list[0])
            list.append(data[place])
            place+=1




if __name__=="__main__":
    with open("Advent_Calendar\day6\data_day_6.txt","r") as file:
        print(four_different(file.read().strip("\n"))) 
        file.close()