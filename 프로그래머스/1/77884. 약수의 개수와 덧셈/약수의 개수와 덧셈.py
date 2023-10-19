def solution(left, right):
    answer = 0    
    count_list = []
    
    for i in range(left, right+1):
        count = 0
        for j in range(1, i+1):
            if i%j == 0:
                count += 1
        answer = answer+i if count%2 == 0 else answer-i
            
    return answer