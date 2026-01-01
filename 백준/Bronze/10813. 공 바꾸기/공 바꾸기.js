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

    let basket = [];
    fillBasket(basket, N);

    for (let i = 2; i < item.length; i += 2) {
        changeBasket(basket, i, item);
    }

    console.log(basket.join(' '));
}

function fillBasket(basket, N) {
    for (let i = 0; i < N; i++) {
        basket[i] = i + 1;
    }
}

function changeBasket(basket, idx, item) {
    let start = item[idx];
    let end = item[idx + 1];

    let temp = basket[end - 1];
    basket[end - 1] = basket[start - 1];
    basket[start - 1] = temp;
}

solution(input);
