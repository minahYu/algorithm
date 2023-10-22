def solution(price, money, count):
    answer = -1
    totalAmount = price
    
    for rotation in range(count-1):
        price *= rotation+1
        totalAmount += price
        
    answer = totalAmount-money if totalAmount-money > 0 else 0

    return answer