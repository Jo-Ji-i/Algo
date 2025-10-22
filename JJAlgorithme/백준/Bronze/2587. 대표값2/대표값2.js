const fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString();
input = input.trim().split('\n').map(Number);

const arr = input.sort((a, b) => a - b);
const midIdx = parseInt(arr.length / 2);
const avg = arr.reduce((acc, cur) => acc + cur) / arr.length;
console.log(avg + '\n' + arr[midIdx]);
