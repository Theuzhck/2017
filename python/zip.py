def zipando(l1, l2):
    if len(l1)==0 or len(l2)==0:
        return res
    else:
        res.append((l1[0], l2[0]))
        zipando(l1[1:], l2[1:])
        return res

res=[]

l1= eval(input())
l2 = eval(input())

print(zipando(l1, l2))