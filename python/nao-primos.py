seq=1
maior = 2
while seq<=10:
  menor=2
  aumenta = 1
  maior+=1
  terminou = False
  while (menor<maior) and (terminou==False):
    if (maior%menor==0):
      aumenta=aumenta+1
      terminou=True
    menor+=1
  if aumenta >1:
    seq+=1
  else:
    seq=1
for i in range(10):
  print ((maior-9)+i)