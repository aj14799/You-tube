num1,num2 = int(input()),int(input())
def powersum(num,count,total,pair_count):
    pow_num = num**num2
    if pow_num==total:
        return pair_count+1
    if pow_num < total:
        return powersum(num+1,count-1,total-pow_num,pair_count) + powersum(num+1,count,total,pair_count)
    return pair_count
lim=(num1**(1/float(num2)))
print(powersum(1,lim,num1,0))