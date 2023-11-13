def solution(food):
    answer = ''
    half = ''
        
    for i in range(1, len(food)):
        for j in range(food[i]//2):
            half += str(i)
            
    answer += half
    answer += '0'
    answer += half[::-1]
        
    return answer