import re

def solution(new_id):

    answer = (IdFactory(new_id)
    .to_lower_case()
    .replace_special_chars()
    .replace_first_and_last_format()
    .checked_length()
    .replace_first_and_last_format()
    .transfer_short_id()
    .to_str())

    return answer
class IdFactory:

    id: str
    def __init__(self, id: str):
        self.id = id

    def to_lower_case(self):
        return IdFactory(self.id.lower())

    def replace_special_chars(self):
        return IdFactory(re.sub("\\.{2,}", ".", re.sub("[^a-z0-9\\-\\_\\.]", "", self.id)))

    def replace_first_and_last_format(self):

        answer = self.id.strip().strip('.')

        if not answer:
            return IdFactory("a")

        return IdFactory(answer)

    def checked_length(self):
        answer = self.id
        if len(answer) > 15:
            answer = answer[0:15]

        return IdFactory(answer)

    def transfer_short_id(self):
        answer = self.id
        while len(answer) < 3:
            answer += answer[-1]

        return IdFactory(answer)

    def to_str(self):
        return self.id

new_ids = [
    "...!@BaT#*..y.abcdefghijklm",
    "z-+.^.",
    "=.=",
    "123_.def",
    "abcdefghijklmn.p"
]

expected = [
    "bat.y.abcdefghi",
    "z--",
    "aaa",
    "123_.def",
    "abcdefghijklmn"
]

for new_id, result in zip(new_ids, expected):
    print(f"결과: {solution(new_id)} / 예상: {result}")