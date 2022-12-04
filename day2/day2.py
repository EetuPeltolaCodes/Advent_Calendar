def RPS(matrix,file_name):
    sum=0
    with open(file_name,"r") as file:

        for line in file:
            if line[0]=="A" and line[2]=="X":
                line=line.replace(line[0],"0")
                line=line.replace(line[2],"2")
            elif line[0]=="A" and line[2]=="Y":
                line=line.replace(line[0],"0")
                line=line.replace(line[2],"0")
            elif line[0]=="A" and line[2]=="Z":
                line=line.replace(line[0],"0")
                line=line.replace(line[2],"1")    
            elif line[0]=="B" and line[2]=="X":
                line=line.replace(line[0],"1")
                line=line.replace(line[2],"0")
            elif line[0]=="B" and line[2]=="Y":
                line=line.replace(line[0],"1")
                line=line.replace(line[2],"1")
            elif line[0]=="B" and line[2]=="Z":
                line=line.replace(line[0],"1")
                line=line.replace(line[2],"2")    
            elif line[0]=="C" and line[2]=="X":
                line=line.replace(line[0],"2")
                line=line.replace(line[2],"1")
            elif line[0]=="C" and line[2]=="Y":
                line=line.replace(line[0],"2")
                line=line.replace(line[2],"2")
            elif line[0]=="C" and line[2]=="Z":
                line=line.replace(line[0],"2")
                line=line.replace(line[2],"0")

            sum+=matrix[int(line[2])][int(line[0])]
    file.close()
    return sum
        


if __name__ == "__main__":
    # Enemys: Rock=0,Paper=1,Scissors=2
    # Rock=0,Paper=1,Scissors=2
    matrix=[[4,1,7],[8,5,2],[3,9,6]]
    print(RPS(matrix,"data_day_2.txt"))