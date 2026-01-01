let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    let max = Math.max(...item);
    let maxIndx = item.indexOf(max, 0);

    console.log(max);
    console.log(maxIndx + 1);
}

solution(input);
