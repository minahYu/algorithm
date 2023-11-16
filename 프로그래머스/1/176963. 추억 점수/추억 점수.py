def solution(name, yearning, photo):
    answer = []
    
    for photo in photo:
        point = 0
        for person in range(len(name)):
            if name[person] in photo:
                point += yearning[person]
        answer.append(point)
    
    return answer