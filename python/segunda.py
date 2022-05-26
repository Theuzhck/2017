import random
def embaralha(lista):
    size = len(lista) - 1
    for i in range (size):
        ind = random.randint(0,size)
        lista[i], lista[ind] = lista[ind], lista[i]
#Só acrescentei a parte do I/O
testelist = random.sample(range(-50,50), 10)
embaralha(testelist)
print(testelist)