let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    const answer = cirArr(item);
    console.log(answer);
}

function cirArr(arr) {
    const [a, b, c] = arr.sort((x, y) => x - y);

    if (a === c) {
        return 10000 + a * 1000;
    }

    if (a === b || b === c) {
        return 1000 + b * 100;
    }

    return c * 100;
}

solution(input);
