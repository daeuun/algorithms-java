from cgi import print_arguments


s = input()
result = int(s[0])

for i in range(1, len(s)):
    num = int(s[0])
    if num <= 1 or result <= 1:
        result += num
    else:
        result *= num

print(result)
