let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    const N = item[0];
    let arr = item.slice(1, item.length);

    console.log(Math.min(...arr), Math.max(...arr));
}

solution(input);
