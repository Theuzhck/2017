def merge(e, d):
    r = []
    while len(e) > 0 and len(d) > 0:
        if e[0] <= d[0]:
            r.append(e[0])
            e = e[1:]
        else:
            r.append(d[0])
            d = d[1:]
    r += e
    r += d
    return r


def mergesort(v):
    if len(v) <= 1:
        return v
    else:
        m = len(v) // 2
        e = mergesort(v[:m])
        d = mergesort(v[m:])
        return merge(e, d)

import random

testelist = random.sample(range(-20,20),30)
print (testelist)
print(mergesort(testelist))