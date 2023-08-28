def f1(function):

    def dec(*args, **kwargs):

        print("Start", end="") 
        function (*args, **kwargs) 
        print("End", end="")

    return dec

@f1
def f(a,b=9):

    print (a,b,end=" ")

f('Hi')