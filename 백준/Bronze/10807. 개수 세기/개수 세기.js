let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    const num = item[0];
    let arr = item.slice(1, num + 1);
    let target = item[num + 1];
    let total = 0;

    for (let i = 0; i < num; i++) {
        if (arr[i] === target) {
            total++;
        }
    }

    console.log(total);
}

solution(input);
