while(True):
    M, N = [int(x) for x in input() .split()]
    if M==0 and N==0:
        break;
    anstemp = 0
    ans2 = 0
    ans1 = 0

    lista = []
    for i in range(M):
        input_string = input()
        input_string_splited = input_string.split(' ')

        max_sum = int(input_string_splited[0])
        if N == 1:
            bf = 0
        else:
            bf = int(input_string_splited[1])
            input_string_splited.remove(input_string_splited[0])
            input_string_splited.remove(input_string_splited[0])
            lista =[int(x) for x in input_string_splited]

        cont = 0
        tes = []
        for j in range(2,N):
             bftemp = bf
             bf = max_sum + lista[cont]
             max_sum = max( max_sum, bftemp)
             cont+=1
        if i>1:
            anstemp = ans2
            ans2 = ans1 + max(bf,max_sum)
            ans1 = max( ans1, anstemp )
        elif i == 0:
            ans1 = max(bf,max_sum)
        else:
            ans2 = max(bf,max_sum)
    print(max(ans1, ans2))