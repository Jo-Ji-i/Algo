let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

function solution(item) {
    const input = item.slice(0, item.length);
    const arr = input.map((x) => x.split(' ').map(Number));

    let max = -999,
        row = 0,
        col = 0;

    arr.forEach((rows, rowIdx) => {
        rows.forEach((val, colIdx) => {
            if (val > max) {
                max = val;
                row = rowIdx + 1;
                col = colIdx + 1;
            }
        });
    });

    console.log(max);
    console.log(row, col);
}

solution(input);
