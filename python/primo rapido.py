N=int(input())
for i in range(1,N+1):
  primo= int(input())
  if (primo==1) or (primo==2) or (primo==3) or (primo==5) or (primo==7):
    print("Prime") 
    continue
  if primo%2==0:
    print("Not Prime")
    continue
  elif (primo%3==0):
    print("Not Prime")
    continue
  elif (primo%5==0):
    print("Not Prime")
    continue
  elif (primo%7==0):
    print("Not Prime")
    continue
  else:
    print("Prime")
    continue