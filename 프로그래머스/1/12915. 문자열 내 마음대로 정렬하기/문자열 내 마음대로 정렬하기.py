def solution(strings, n):
    answer = []
    dic = dict()
    
    strings.sort()
    for string in strings:
        dic[string] = string[n]
        
    answer = sorted(dic, key=lambda item:item[n])
        
    return answer