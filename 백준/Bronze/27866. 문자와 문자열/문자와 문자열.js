let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

function solution(item) {
    let word = item[0];
    console.log(word.charAt(item[1] - 1));
}

solution(input);
