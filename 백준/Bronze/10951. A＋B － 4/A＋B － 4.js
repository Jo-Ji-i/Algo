let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    let arr = [];
    let len = item.length;

    for (let i = 0; i < len; i += 2) {
        arr.push(item[i] + item[i + 1]);
    }
    console.log(arr.join('\n'));
}

solution(input);
