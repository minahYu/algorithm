def solution(hp):
    answer = 0
    attacks = [5, 3, 1]
    
    for attack in attacks:
        answer += hp//attack
        hp %= attack
    
    return answer