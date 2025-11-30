let fs = require('fs');
/**
 '/dev/stdin'
 **/

const input = fs
    .readFileSync(0)
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

const quadrant = [
    [1, 1],
    [-1, 1],
    [-1, -1],
    [1, -1],
];

function solution(item) {
    let X = item[0] > 0 ? 1 : -1;
    let Y = item[1] > 0 ? 1 : -1;

    let result = [X, Y];

    const index = quadrant.findIndex(
        (el) => el[0] === result[0] && el[1] === result[1]
    );
    if (index === -1) {
        console.log('없음');
    } else {
        console.log(index + 1);
    }
}

solution(input);
