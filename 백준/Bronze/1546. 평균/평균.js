let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    let N = item[0];
    let arr = item.slice(1, item.length);
    let M = Math.max(...arr);
    let result = 0;

    arr.forEach((e) => {
        result += (e / M) * 100;
    });

    result_avg = result / N;
    console.log(result_avg);
}

solution(input);
