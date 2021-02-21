
'''
Given an integer array, output all the unique pairs that
sum up to a specific value k
'''

def par_sum(array, k):
    if len(array) < 2
        return print('Too petite')

    seen = set()
    output = set()

    for num in array:
        target = k - num
        if target not in seen:
            seen.add(num)

        else:
            output.add((min(num, targert), max(num, target)))

    print('\n'.join(map(str, list(output))))

pair_sum([1, 3, 2, 2])

#output: (1,3)
#        (2,2)

