def solution(d, budget):
    answer = 0
    sum = 0
    
    d.sort()
    for dbudget in d:
        sum += dbudget
        if(sum <= budget):
            answer += 1
            
    return answer