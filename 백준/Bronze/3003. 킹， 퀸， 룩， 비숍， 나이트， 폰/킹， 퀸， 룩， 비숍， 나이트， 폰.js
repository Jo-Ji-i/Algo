let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

const chess = [1, 1, 2, 2, 2, 8];

function solution(item) {
    let arr = [];
    for (let idx in chess) {
        arr.push(chess[idx] - item[idx]);
    }
    console.log(arr.join(' '));
}

solution(input);
