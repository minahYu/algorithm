def solution(price, money, count):
    answer = -1
    n_price = []
    
    for rotation in range(count):
        n_price.append(price * (rotation+1))
            
    balance = sum(n_price)-money
    answer = balance if balance > 0 else 0

    return answer