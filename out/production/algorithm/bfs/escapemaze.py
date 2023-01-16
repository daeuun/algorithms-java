# BFS
from collections import deque


def bfs(x, y):
    queue = deque()
    queue.append((x, y))
    # 큐가 빌때까지 반복
    while queue:
        x, y = queue.popleft()
        # 현재 위치에서 네방향으로 위치 확인
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            # 미로찾기 공간 벗어난 경우 무시
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue10
            # 벽인 경우 무시
            if graph[nx][ny] == 0:
                continue
            # 해당 노드 첫방문 경우에 최단 거리 기록
            if graph[nx][ny] == 1:
                graph[nx][ny] = graph[x][y] + 1
                queue.append((nx, ny))
    # 가장 오른쪽 아래까지의 최단 거리 반환
    return graph[n - 1][m - 1]


n, m = map(int, input().split())
# 2차원 리스트 맵
graph = []
for i in range(n):
    graph.append(list(map(int, input())))

# 이동할 방향 (상, 하, 좌, 우)
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

print(bfs(0, 0))
