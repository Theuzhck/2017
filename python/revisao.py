#Programa feito por Matheus Henrick Santos Ferreira
import re
dic = {}
medD = {}
faltasD = {}
statusD = {}
try:
    while True:
        string = str(input())
        findnome = re.findall("\D+", string)
        name = findnome[0]

        findnota = re.findall("\d?\d.?\d?", string)
        number = findnota[-1]
        if name in dic:
            now = dic[name]
            faltasD[name] = eval(number)
            media = now/3
            medD[name] = media
            dic[name] = now + eval(number)
            if medD[name] >= 7:
                statusD[name] = "APROVADO"
            elif (medD[name])>5 and (faltasD[name]<22):
                statusD[name] = "APROVADO"
            else:
                statusD[name] = "REPROVADO"
        else:
            medD[name] = 0
            dic[name] = eval(number)
            faltasD[name] = number
            if medD[name] >= 7:
                statusD[name] = "APROVADO"
            elif (medD[name])>5 and (faltasD[name]<22):
                statusD[name] = "APROVADO"
            else:
                statusD[name] = "REPROVADO"

except (KeyboardInterrupt, ValueError, IndexError, EOFError):
    ord = sorted(statusD.keys())
    tord = len(ord)

    for m in range(tord):
        key = ord[m]
        mostrar = key+statusD[key]
        mostrar = " ".join(mostrar.split())
        print(mostrar)