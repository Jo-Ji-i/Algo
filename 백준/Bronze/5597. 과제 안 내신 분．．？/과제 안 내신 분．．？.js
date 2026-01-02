let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    let arr = new Array(31).fill(0);
    item.forEach((e) => arr[e]++);
    checkArr(arr);
}

function checkArr(arr) {
    for (let i = 1; i <= arr.length - 1; i++) {
        if (arr[i] === 0) {
            console.log(i);
        }
    }
}

solution(input);
