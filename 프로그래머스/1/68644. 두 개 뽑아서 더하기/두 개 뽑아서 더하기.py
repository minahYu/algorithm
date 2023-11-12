def solution(numbers):
    set_num = set()
    
    for i in range(len(numbers)-1):
        for j in range(i+1, len(numbers)):
            set_num.add(numbers[i] + numbers[j])
    
    return sorted(list(set_num))