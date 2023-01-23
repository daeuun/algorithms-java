from bisect import bisect_left, bisect_right

# [left_value, right_value] 인 데이터 개수 반환
def countbyrange(array, left_value, right_value):
    right_index = bisect_right(array, right_value)
    left_index = bisect_left(array, left_value)
    return right_index - left_index

n, x = map(int, input().split()) # n:데이터 개수, x:찾을 값
array = list(map(int, input().split())) # 전체 데이터

# [x, x] 범위에 있는 데이터 개수
count = countbyrange(array, x, x)

# 값이 x인 원소 존재하지 않을 경우
if count == 0:
    print(-1)
# 값이 x인 원소 존재하면
else:
    print(count)