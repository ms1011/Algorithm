def solution(id_pw, db):
    answer = ''
    db_dict = {}

    for i in db:
        db_dict.update({i[0]: i[1]})

    if db_dict.get(id_pw[0]) is None:
        answer = 'fail'
    elif db_dict.get(id_pw[0]) == id_pw[1]:
        answer = 'login'
    elif db_dict.get(id_pw[0]) != id_pw[1]:
        answer = 'wrong pw'

    return answer
