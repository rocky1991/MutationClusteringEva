import numpy as np

a = [1,2,3]
b = [2,3]
c = []
c.append(a)
c.append(b)
print(c[0])
flat = False
for item in a:
	if(item==3):
		flat = True
print(flat)