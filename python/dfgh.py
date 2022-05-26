for linha in arquivo:
    l = linha.replace('\n', ' ')
    aux = l.split(' ')
    for i in aux:
        if dist == 0:
            dist = infinito
        linha.append(numeros)

for k in range(len(numeros)):
    for i in range(len(numeros)):
        for j in range(len(numeros)):
            if d[i][j] > d[i][k] + d[k][j]:
                d[i][j] = d[i][k] + d[k][j]
            if i == j:
                d[i][j] = infinito

#for i in range (n):
#	linha = []
#	for j in range (n):
#		dist = int(input())
#		if dist == 0:
#			dist = infinito
#		linha.append(dist)
#	d.append(linha)


for i in range (n):
	print(d[i])

