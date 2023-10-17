def solution(n):
    answer = ''
    
    for count in range(n):
        answer = answer+"박" if (count+1)%2 == 0 else answer+"수"
    
    return answer