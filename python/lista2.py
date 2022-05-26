#Atividade feita por Matheus do Espírito Santo e Matheus Henrick
#As variáveis N e M foram modificadas para casos e qtd respectivamente
#Se o arquivo palavras.txt tiver menos do que 20 palavras com tamanho menor que 5 o programa dará erro na linha 17
import random
arquivo = open ('palavras.txt')
casos = random.randint(5,15)
palavras = []
for k in range(casos):
    dic = {}
    for linha in arquivo:
        l = linha.replace('\n', '')
        aux = l.split()
        for palavra in aux:
            if len(palavra) > 5:
                palavras.append(palavra)
    qtd = random.randint(10, 20)
    aleatorio = random.sample(palavras, qtd)
    for i in range(qtd):
        dic[aleatorio[i]] = len(aleatorio[i])
    print(dic)