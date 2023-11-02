def solution(s):
    answer = []
    s_list = list(s)
    
    for val, idx in zip(s_list, range(len(s_list))):
        if s.index(val) == idx:
            answer.append(-1)
        else:
            answer.append(idx-s_list.index(val))
            s_list[s_list.index(val)] = ""
    
    return answer