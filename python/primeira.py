import random
def merge (l1, l2):
    res = []
    tam = len(l1) + len(l2)
    for k in range (tam): #Substitui os laços aninhados pela soma ddos tamanhos de cada uma das listas
            if (l1[-1] > l1[0]) or (l2[-1] > l2[0]) : # Listas em ordem crescente
                if l1[0] < l2[0]:   #Deixei de verificar apenas na primeira lista se as listas são ascendentes na linha anterior
                    res.append(l1[0]) # ou descendentes
                    l1 = l1[1:]  # Para não repetir números eu retiro o número da lista 1 que foi adicionado em res
                    if (len(l1) == 1):  # Quando a lista ficar com 1 elemento adiciona um número qualquer grande o bastante
                        l1.append(295703295702395705723059825)  # para não ser comparável com nenhum outra lista oposta
                elif (l2[0] < l1[0]) or (l2[0]==l1[0]):
                    res.append(l2[0])
                    l2 = l2[1:]  # Equivalente a linha 9
                    if (len(l2) == 1):  # Equivalente a linha 10
                        l2.append(295703295702395705723059825)  #Equivalente a linha 11
            elif (l1[0] > l1[-1]) or (l2[0] > l1[-1]): #Listas em ordem decrescente
                if (l1[0] > l2[0]):
                    res.append(l1[0])
                    l1 = l1[1:]  # Equivalente a linha 9
                    if (len(l1) == 1):  # Quando a lista ficar com 1 elemento adiciona um número qualquer pequeno o bastante
                        l1.append(-295703295702395705723059825)  # para não ser comparável com nenhum outra lista oposta
                elif (l2[0] > l1[0]):
                    res.append(l2[0])
                    l2 = l2[1:] #
                    if (len(l2)==1):# Quando a lista ficar com 1 elemento adiciona um número qualquer pequeno o bastante
                        l2.append(-295703295702395705723059825)  # para não ser comparável com nenhum outra lista oposta
    return res

l1 = eval(input())#[-15, -10, -5, 0, 5, 10, 15, 20, 25]
l2 = eval(input())#[2, 4, 6, 8, 10, 12, 14]
print(merge(l1,l2))
