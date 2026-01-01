let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    const N = item[0];
    const M = item[1];

    let basket = new Array(N).fill(0);

    for (let i = 2; i < item.length; i += 3) {
        rotation(i, item, basket);
    }

    console.log(basket.join(' '));
}

function rotation(order, item, basket) {
    let arr = item.slice(order, order + 3);
    let start = arr[0];
    let end = arr[1];
    let ball = arr[2];

    for (let i = start; i <= end; i++) {
        basket[i - 1] = ball;
    }
}

solution(input);
