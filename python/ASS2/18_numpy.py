import numpy as np

rands = np.random.randint(low=0, high=20, size=15)

print(rands)
print(max(rands, key=rands.tolist().count))