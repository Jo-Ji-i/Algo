let fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

let len = 3;

function solution(item) {
    let number = Number(item[0]);
    let target = item[1]
        .split('')
        .reverse()
        .map((x) => Number(x));

    for (let i = 0; i < len; i++) {
        console.log(number * target[i]);
    }
    console.log(number * Number(item[1]));
}

solution(input);
