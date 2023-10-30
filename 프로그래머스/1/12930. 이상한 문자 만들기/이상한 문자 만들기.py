def solution(s):
    answer = ''
    s_word = s.split(" ")
    
    for i in range(len(s_word)):
        s_list = list(s_word[i])
        for j in range(len(list(s_word[i]))):
            if(s_word[i] == " "):
                break
            s_list[j] = s_list[j].upper() if j%2 == 0 else s_list[j].lower()
            answer += s_list[j]
        
        if(i != len(s_word)-1) :
            answer += " "
    
    return answer