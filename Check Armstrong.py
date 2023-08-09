n=int(input())
num=n
le=len(str(n))
sum=0
while(n>0):
    b=n%10
    sum+=b**le
    n=int(n/10)
if sum==num:
    print('true')
else:
    print('false')
