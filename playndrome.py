start = 0 
end  = 0 
Data = "abcba"
table = [[0 for x in Data]for j in Data]

def FillTheTable(Data):
    for i in range(len(Data)):
        for j in range(i , len(Data)):
            if Data[i] == Data[j] :
                table[i][j] = 1
    return table

newTable = FillTheTable(Data)
print(newTable)


