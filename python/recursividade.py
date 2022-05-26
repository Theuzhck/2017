def maxR( lista ):
    if (len(lista)==1):
        return lista[0]
    else:
        return max(lista[0],maxR(lista[1:]))

def minR (lista):
    if (len(lista)==1):
        return lista[0]
    else:
        return min(lista[0],minR(lista[1:]))

def somaR (lista):
    if len(lista)==1:
        return lista[0]
    else:
        return lista[0]+ somaR(lista[1:])

def invertidaR(lista):
    invertida = []
    if len(lista)==1:
        invertida.append(lista[0])
        return invertida
    else:
        return invertidaR(lista[1:]) + [lista[0]]

def binominalR(n,k):
    if (n==0) and (k>0):
        return 0
    elif (n>=0) and (k==0):
        return 1
    elif (n>0) and (k>0):
        return binominalR(n-1,k)+binominalR(n-1, k-1)

def fibonacciR(n):
    if n== 1:
        return 1
    elif n ==2:
        return 1
    else:
        return fibonacciR(n-1) + fibonacciR(n-2)

n = 10
a = [12,15,9]
print("Teste 1 usando a lista ", a, ". Valor maximo encontrado: ",  maxR(a))
print("Teste 2 usando a lista ", a, ". Valor minimo encontrado: ",  minR(a))
print("Teste 3 usando a lista ", a, ". Soma encontrada: ",  somaR(a))
print("Teste 4 usando a lista ", a, ". Lista encontrada: ",  invertidaR(a))
print("Teste 5 usando binomial. Resultado encontrado: ",  binominalR(3,2))
print("Teste 6 usando Fibbonacci. Resultado encontrado: ",  fibonacciR(n))