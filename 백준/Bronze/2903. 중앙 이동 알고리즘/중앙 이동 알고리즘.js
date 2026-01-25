let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

function solution(item) {
    const input = parseInt(item);
    const dot = Math.pow(2, item) + 1;
    console.log(Math.pow(dot, 2));
}

solution(input);
