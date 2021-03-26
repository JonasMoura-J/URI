A, B, C, D = [float(x) for x in input() .split()]
		
media = (A*2 + B*3 + C*4 + D*1)/10.0

print("Media: %.1f" %media)

if(media>= 7.0):
    print("Aluno aprovado.")

if(media < 5.0):
    print("Aluno reprovado.")

if(media >= 5.0 and media < 7.0):
    print("Aluno em exame.")
    notaex = float(input())
    print("Nota do exame: %.1f" %notaex)
    novaMedia = (media+notaex)/2
    if(media>= 5.0):
        print("Aluno aprovado.")
    else:
        print("Aluno reprovado.")
    
    print("Media final: %.1f" %novaMedia)