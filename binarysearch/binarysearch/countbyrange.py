from bisect import bisect_left, bisect_right

# 값이 [left_value, right_value] 인 데이터의 개수를 반환 (두 값 사이의 개수를 반환)
def count_by_range(a, left_value, right_value):
    right_index = bisect_right(a, right_value)
    left_index = bisect_left(a, left_value)
    return right_value - left_index

a = [1, 2, 3, 4, 5, 6, 7, 8, 9]

# 값이 4인 데이터 개수 출력
print(count_by_range(a, 4, 4)

# 값이 [-1, 3] 범위의 데이터 개수 출력
print(count_by_range(a, -1, 3)
