def solution(s):
    answer = []
    s_list = list(s)
    
    for val, idx in zip(s_list, range(len(s_list))):
        first = s_list.index(val)
        if first == idx:
            answer.append(-1)
        else:
            answer.append(idx-first)
            s_list[first] = ""
    
    return answer