def solution(n, m):
    answer = []
    
    def lcm(n, m):
        return m*n / gcd(n, m)
    
    def gcd(n, m):
        while m%n != 0:
            m,n = n, m%n
        return min(m,n)
    
    answer = [gcd(n, m), lcm(n, m)]
    
    return answer