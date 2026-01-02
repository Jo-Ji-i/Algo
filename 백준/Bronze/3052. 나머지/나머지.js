let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    let N = 42;
    let arr = [];

    for (let value of item) {
        arr.push(value % N);
    }

    let set = new Set(arr);
    let count = [...set].length;
    console.log(count);
}

solution(input);
