def solution(sizes):
    answer = 0
    max_l = 0
    max_w = 0
    
    for size in sizes:
        if size[0] < size[1]:
            size[0], size[1] = size[1], size[0]
        
        if max_l < size[1]:
            max_l = size[1]
        if max_w < size[0]:
            max_w = size[0]
        
    answer = max_w * max_l
    
    return answer