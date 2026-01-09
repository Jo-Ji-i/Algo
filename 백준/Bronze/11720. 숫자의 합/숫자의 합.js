let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

function solution(item) {
    let word = item[1].split('').map(Number);

    const num = word.reduce((acc, num) => acc + num, 0);

    console.log(num);
}

solution(input);
