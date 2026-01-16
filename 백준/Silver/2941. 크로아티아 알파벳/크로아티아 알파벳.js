let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

const cro = {
    'c=': 0,
    'c-': 0,
    'dz=': 0,
    'd-': 0,
    lj: 0,
    nj: 0,
    's=': 0,
    'z=': 0,
};

function solution(item) {
    let str = item.toString();
    getMode(str);
}

function getMode(str) {
    let start = 0;
    let check = 0;

    while (start < str.length) {
        if (str.substr(start, 3) === 'dz=') {
            cro['dz=']++;
            start += 3;
            check += 1;
            continue;
        }

        const text = str.substr(start, 2);

        if (text in cro) {
            cro[text]++;
            start += 2;
            check += 1;
        } else {
            start += 1;
            check += 1;
        }
    }

    console.log(check);
}

solution(input);
