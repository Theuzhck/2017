#Resposta de Matheus Henrick e Rafael Italo
def caixa(texto):
    min = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    max = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
    r = []
    carac = ['/', '?', ',', ' ', '!', '@', '#', '$', '%', '&', '*', '(', ')', '-', '_']
    for i in texto:
        for k in range (0, 25):
           if i == min[k]:
               r.append(max[k])
               break
           elif i == max[k]:
               r.append(i)
               break
           elif i in carac:
               r.append(i)
               break
    return ''.join(r)

texto = input()

print(caixa(texto))
