let fs = require('fs');
const input = fs
    .readFileSync('dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    if (item[0] > item[1]) {
        console.log('>');
    } else if (item[0] < item[1]) {
        console.log('<');
    } else {
        console.log('==');
    }
}

solution(input);
