def solution(s):
    answer = 0
    dic = { 'zero': '0', 'one': '1', 'two': '2', 'three': '3', 'four': '4', 
           'five': '5', 'six': '6', 'seven': '7', 'eight': '8', 'nine': '9' }
    
    for dic_key, dic_val in zip(dic, dic.values()):
        if s.isdigit():
            break
        s = s.replace(dic_key, dic_val)
        
    answer = int(s)
    
    return answer