arr = [6, 3, 4, 9, 2, 5, 7, 1, 8, 0]

def quicksort(array):
    # 리스트에 하나 이하의 원소만 존재하면 종료
    if len(array) <= 1:
        return array
    pivot = array[0] # pivot : 첫번째 원소
    tail = array[1:] # pivot을 제외한 리스트, list slicing 이용해서 2 ~ 마지막 원소까지로 설정

    # list comprehension
    # tail 검사해서 pivot 보다 작은지 큰지 판단
    left_side = [x for x in tail if x <= pivot] # 분할된 왼쪽
    right_side = [x for x in tail if x > pivot] # 분할된 오른쪽

    # 분할 이후, 왼쪽 오른쪽에서 각각 정렬 수행하고, 현재 pivot 리스트 붙여서, 전체 리스트 return
    return quicksort(left_side) + [pivot] + quicksort(right_side)

print(quicksort(array)