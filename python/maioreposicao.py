i = 1

maior = 0

while i <=100:

    atual = int(input())

    if atual > maior:

        maior = atual

        posicao = i

    i+=1

print(maior)

print(posicao)