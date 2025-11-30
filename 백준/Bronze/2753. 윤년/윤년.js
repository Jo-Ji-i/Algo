let fs = require('fs');
const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    if ((item % 4 == 0 && item % 100 != 0) || item % 400 == 0) {
        console.log(1);
    } else {
        console.log(0);
    }
}

solution(input);
