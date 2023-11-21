def solution(k, score):
    answer = []
    k_pack = []
    
    for i in range(len(score)):
        k_pack = sorted(score[0:i+1], reverse=True)
        k_pack = k_pack[0:i+1] if i<k else k_pack[0:k]
        answer.append(min(k_pack))
    
    return answer