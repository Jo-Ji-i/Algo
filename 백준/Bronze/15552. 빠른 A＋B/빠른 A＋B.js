let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    const frequency = item[0];
    let lines = [];

    for (let i = 2; i <= frequency * 2; i += 2) {
        lines.push(item[i - 1] + item[i]);
    }

    console.log(lines.join('\n'));
}

solution(input);
