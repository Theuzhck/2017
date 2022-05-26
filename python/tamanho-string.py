n = int(input())
for i in range (n):
  lista = input().split()
  tam = len(lista)
  bolha = True
  while bolha:
    bolha = False
    for k in range (tam-1):
      tam1 = len(lista[k])
      tam2 = len(lista[k+1])
      if (tam1<tam2):
        bolha = True
        tam = k+1
        lista[k], lista[k+1] = lista[k+1], lista[k]
  print(" ".join(lista))