def solution(n, arr1, arr2):
    answer = []
    
    for x, y in zip(arr1, arr2):
        x = format(x, f'0{n}b')
        y = format(y, f'0{n}b')
        line = ''
        
        for i in range(n):
            line += '#' if x[i] == '1' or y[i] == '1' else ' '         
        answer.append(line)
    
    return answer