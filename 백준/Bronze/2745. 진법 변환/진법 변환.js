let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

function solution(item) {
    const [N, B] = item[0].split(' ');
    console.log(parseInt(N, B).toString(10));
}

solution(input);
