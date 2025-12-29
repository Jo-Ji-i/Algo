let fs = require('fs');

const input = fs
    .readFileSync('/dev/stdin')
    .toString()
    .trim()
    .split(/\s+/)
    .map(Number);

function solution(item) {
    let h = item[0];
    let m = item[1];
    let require = item[2];

    let total = h * 60 + m;
    total = (total + require + 1440) % 1440;
    timeCir(total);
}

function timeCir(minit) {
    let h = Math.floor(minit / 60);
    let m = minit % 60;

    console.log(h, m);
}

solution(input);
