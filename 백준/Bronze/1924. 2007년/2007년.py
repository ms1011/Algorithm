import calendar

arrList = ["MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"]
x, y = map(int, input().split())

Day = calendar.weekday(2007, x, y)
print(arrList[Day])