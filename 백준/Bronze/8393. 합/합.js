let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    let total = 0;
    for (let i = 1; i <= item; i++) {
        total += i;
    }
    console.log(total);
}

solution(input);
