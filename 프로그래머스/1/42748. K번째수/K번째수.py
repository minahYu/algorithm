def solution(array, commands):
    answer = []
    arr = []
    
    for c_arr in commands:
        arr = sorted(array[c_arr[0]-1:c_arr[1]])
        answer.append(arr[c_arr[2]-1])
    
    return answer