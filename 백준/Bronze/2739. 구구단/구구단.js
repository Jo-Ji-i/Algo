let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    print(item);
}

function print(n) {
    for (let i = 1; i <= 9; i++) {
        console.log(n + ' * ' + i + ' = ' + n * i);
    }
}

solution(input);
