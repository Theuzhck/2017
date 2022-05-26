def quicksort(lista, menor, maior):
    if ((maior-menor) >0):
        p = partition (lista, menor, maior)
        quicksort(lista,menor, p-1)
        quicksort(lista, p+1, maior)

def partition(lista, menor, maior):
    divisor = menor
    pivo = maior
    for i in range (menor, maior):
        if lista[i]<lista[pivo]:
            lista[i], lista[divisor] = lista[divisor], lista[i]
            divisor +=1
    lista[pivo], lista[divisor] = lista[divisor], lista[pivo]

    return divisor
import random
testelist = random.sample(range(-20,20),30)
quicksort(testelist, 0, 29)
print(testelist)