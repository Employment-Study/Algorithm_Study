def fib(n):
    # print('fib(%d)' % n)
    if n == 0 : return 0
    elif n == 1 : return 1
    else:
        return fib(n-2) + fib(n-1)
    
print('fib(%d)  = %d'  %(6,fib(6)))