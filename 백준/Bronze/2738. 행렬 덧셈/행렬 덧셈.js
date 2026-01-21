let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

function solution(item) {
    const [n, m] = item[0].split(' ').map(Number);
    const input = item.slice(1, item.length);
    const arr = input.map((x) => x.split(' ').map(Number));

    const result = arr
        .slice(0, n)
        .map((row, i) => row.map((val, j) => val + arr[i + n][j]));

    console.log(result.join('\n').split(',').join(' '));
}

solution(input);
