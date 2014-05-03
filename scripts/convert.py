"""
Usage: python convert.py <topology raw file>
"""

import sys

def main():
    f = open(sys.argv[1])
    line = f.readline().split(' ')
    new = []
    index = 1
    result = ""

    for c in range(len(line)):
        if ':' in line[c]:
            line[c] = line[c].split(':')[0]
        if ((c % 11) >= 6 and (c % 11) <= 10) or (c % 11) == 2:
            continue
        elif (c % 11) == 5 and c < (len(line) - 11):
            new.append(line[c] + '\n')
        else:
            new.append(line[c])

    for _ in new:
        result += _
        if _.endswith('\n'):
            continue
        result += ' '

    print result

if __name__ == '__main__':
    main()
