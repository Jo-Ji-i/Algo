let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    let N = item[0];
    let M = item[1];
    let arr = new Array(N + 1).fill(0);

    for (let key in arr) {
        arr[key] = key;
    }

    for (let i = 2; i < item.length; i += 2) {
        arr = changeArr(arr, item[i], item[i + 1]);
    }

    console.log(arr.slice(1).join(' '));
}

function changeArr(arr, start, end) {
    let front = arr.slice(0, start);
    let temp = arr.slice(start, end + 1).reverse();
    let last = arr.slice(end + 1, arr.length + 1);

    let result = [...front, ...temp, ...last];
    return result;
}

solution(input);
