# This is a sample Python script.

# Press ⌃R to execute it or replace it with your code.
# Press Double ⇧ to search everywhere for classes, files, tool windows, actions, and settings.


def non_repeating(s):
    s = s.replace(' ', '').lower()
    char_count = ()
    for c in s:
        if c in char_count:
            char_count[c] += 1
        else:
            char_count[c] = 1


    for c in s:
        if char_count == 1:
            return c
    return None


print(non_repeating(' I Apple Ape Peels '))

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
