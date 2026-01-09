let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

function solution(item) {
    let M = item[0];
    console.log(M.charCodeAt(0));
}

solution(input);
