
'''
Given a string of words reverse all the words.
'''

def reverse(s):
    length = len(s)
    spaces = [' ']
    words = []
    i = 0

    while i < length:
        if s[i] not in spaces:
            word_start = in
            while i < length and s[i] not in spaces:
                i += 1
            words.append(s[word_start:i])
        i +=1
    #words instead of s maybe
    return " ".join(reversed(s))

print(reversed("This is the best"))

#output: tse eht si siht