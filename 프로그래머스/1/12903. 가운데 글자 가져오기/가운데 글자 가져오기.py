def solution(s):
    answer = ''
    s_list = list(s)
    
    if len(s)%2 == 0:
        answer = s_list[len(s)//2-1]
    answer += s_list[(len(s))//2] 
    
    return answer