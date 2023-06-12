import sys
for line in sys.stdin:
    d = eval(line)
    print("{:.2f}".format(d)) 