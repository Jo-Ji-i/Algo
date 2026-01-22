let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

function solution(item) {
    const PAPER = item[0];
    const input = item.slice(1, item.length);
    let white = Array.from({ length: 101 }, () => Array(101).fill(0));

    input.forEach((element) => {
        const [row, col] = element.split(' ').map(Number);
        fillWhite(white, row, col);
    });

    const result = white.flat().filter((value) => value > 0).length;
    console.log(result);
}

function fillWhite(white, row, col) {
    let rowMax = row + 10;
    let colMax = col + 10;

    for (let i = row; i < rowMax; i++) {
        for (let j = col; j < colMax; j++) {
            white[i][j] += 1;
        }
    }
}

solution(input);
