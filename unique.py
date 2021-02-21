


def unique(s):
    s = s.replace(' ','').lower()
    character = set()

    for letter in s:
        if letter in character:
            return False

        else:
            character.add(letter)

    return True

print (unique('i lkj rejw'))

