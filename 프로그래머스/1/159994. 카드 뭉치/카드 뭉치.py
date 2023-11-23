def solution(cards1, cards2, goal):
    answer = 'Yes'
    cnt1 = 0
    cnt2 = 0
    
    for i in range(len(goal)):
        if cnt1 < len(cards1) and goal[i] == cards1[cnt1]:
            cnt1 += 1
        elif cnt2 < len(cards2) and goal[i] == cards2[cnt2]:
            cnt2 += 1
        else:
            answer = 'No'
    
    return answer