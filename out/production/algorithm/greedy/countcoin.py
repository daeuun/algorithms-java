n = 1000-int(input())
count = 0

coinarray = [500, 100, 50, 10, 5, 1]
for coin in coinarray:
    count += n // coin
    n %= coin

print(count)
