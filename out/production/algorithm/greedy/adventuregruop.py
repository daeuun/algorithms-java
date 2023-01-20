n = int(input())
data = list(map(int, input().split()))
data.sort()

result = 0  # 총그룹
count = 0   # 현재 그룹의 모험가

for i in data:
    count += 1  # 현재 그룹에 모험가 포함시키기
    if count > i:
        result += 1  # 현재 공포도 이상이면 총 그룹의 수 증가
        count = 0

print(result)
