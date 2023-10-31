def solution(t, p):
    answer = 0
    num_from = 0
    
    for i in range(len(t)-len(p)+1):
        num_from = i+len(p)
        if int(t[i:num_from]) <= int(p):
            answer = answer + 1
    
    return answer