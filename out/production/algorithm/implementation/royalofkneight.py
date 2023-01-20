input_data = input()
row = int(input_data[1])
col = int(ord(input_data[0])) - int(ord('a')) + 1

# 이동가능한 방향 정의
directions = [(-2, -1), (-1, -2), (1, -2), (2, -1),
              (2, 1), (1, 2), (-1, 2), (-2, 1)]

result = 0
for direction in directions:
    next_row = row + direction[0]
    newt_col = col + direction[1]
    if next_row >= 1 and next_row <= 8 and newt_col >= 1 and newt_col <= 8:
        result += 1

print(result)
