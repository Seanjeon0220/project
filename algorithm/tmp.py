def solution(a, b):

    ans = []

    for n in a:
        if n in b:
            ans.append(n)
    return ans
    # 예시
    # a = [1, 2, 3, 4], b = [3, 4, 5, 6] → [3, 4]
    # a = [1, 2, 3], b = [4, 5, 6] → []

print(solution([1,2,3,4],[3,4,5,6]))