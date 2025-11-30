let fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split(' ');

function solution(item) {
    let result = item.reduce((acc, cur) => acc + Number(cur), 0);
    console.log(result);
}

solution(input);
