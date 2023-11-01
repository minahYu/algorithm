def solution(s, n):
    answer = ''
    s_list = list(s)
    
    for i in range(len(s_list)):
        move = ord(s_list[i])+n
        
        if s_list[i] == " ":
            answer += " "
        elif 65 <= move and move <= 90 and s_list[i].isupper():
            answer += chr(move)
        elif 97 <= move and move <= 122 and s_list[i].islower():
            answer += chr(move)
        else:
            answer += chr(move - 26)
    
    return answer