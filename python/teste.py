        def fatia(texto):
    s = []
    while len(texto)>1:
        texto = [' '] + fatia(texto[1:])+[texto[0]]
        if len(texto)==1:
            s.append(ord(texto[0]))
            print (s)
    return s
l = input()
print (fatia(l))
