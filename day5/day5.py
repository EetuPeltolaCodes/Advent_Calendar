import string

def stack(name):
    with open(name,"r") as file:
        a=file.read()
        block_list = [[], [], [], [], [], [], [], [], []]
        for line in reversed(a.splitlines()[:8]):
            j = -1
            for i in range(1, len(line), 4):
                j += 1
                if line[i] in set(string.ascii_uppercase):
                    block_list[j].append(line[i])

        for line in a.splitlines()[10:]:
            instructions=line.strip("\n").split(" ")
            items=int(instructions[1])
            move_from=int(instructions[3])-1
            move_to=int(instructions[5])-1

            on_crane = block_list[move_from][-items:]
            block_list[move_from] = block_list[move_from][:-items]
            block_list[move_to].extend((on_crane))
            
        answer=""
        for list in block_list:
            answer+=str(list[-1:][0])

    return answer


if __name__=="__main__":
    file="day5/data_day_5.txt"
    print(stack(file))