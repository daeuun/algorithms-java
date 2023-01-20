# DFS로 특정 노드 방문하고 연결된 모든 노드 방문
def dfs(x, y):
    # 주어진 범위 벗어나는 경우 즉시 종료
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return False
    # 현재 노드 방문하지 않았다면
    if graph[x][y] == 0:
        # 해당 노드 방문처리
        graph[x][y] = 1
        # 상하좌우 위치들 재귀호출
        dfs(x - 1, y)
        dfs(x, y - 1)
        dfs(x + 1, y)
        dfs(x, y + 1)
        return True
    return False


# N, M 공백을 기준으로 구분해 입력받기
n, m = map(int, input().split())

# 2차원 리스트 맵정보
graph = []
for i in range(n):
    graph.append(list(map(int, input())))

# 모든 노드에 음료수 채우기
result = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j) == True:
            result += 1

print(result)
