while (True):
  try:  
    n=int(input())
    import math
    raiz = math.sqrt(n)
    a = 0
    msg = "NO"
    while (a < raiz+1) and (msg=="NO"):
      b = 0
      while (b < raiz+1) and (msg=="NO"):
        soma = (a**2)+ (b**2)
        if soma==n:
          msg = "YES"
        else:
          msg="NO"
        b = b+1
      a = a+1
    print(msg)
  except:
    quit()