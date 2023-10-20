def solution(s):
    answer = ''
    
    s_list = list(s)
    s_list.sort()
    answer = ''.join(s_list)[::-1]
    
    return answer