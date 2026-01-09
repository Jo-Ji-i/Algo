let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

function solution(item) {
    let word = item[0];
    console.log(word.length);
}

solution(input);
