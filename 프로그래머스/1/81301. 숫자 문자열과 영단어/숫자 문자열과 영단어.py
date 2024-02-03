def solution(s):
    num = {"one" : "1", 
             'two' : "2", 
             'three' : '3',
             'four' : '4',
             'five' : '5',
             "six" : '6',
             'seven' : '7',
             'eight' : '8',
             'nine' : '9',
             'zero' : '0'}
    for keys in num.keys():
        s = s.replace(keys, num[keys])
    s = int(s)
    
    
    return s