N=int(input())
for x in range(1,N+1):
    num=int(input())
    primo=0
    for i in range(2,num):
        if (num%i==0):
            primo=1
    if primo==0:
        print(num, "eh primo")
    else:
    	print(num, "nao eh primo")