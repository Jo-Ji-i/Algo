let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

function solution(item) {
    let word = String(item);
    let arr = [...word];

    let arrAscil = [];
    arr.forEach((element) => {
        arrAscil.push(element.charCodeAt() - 97);
    });

    let alpa = new Array(26).fill(-1);

    for (let i = arrAscil.length - 1; i >= 0; i--) {
        alpa[arrAscil[i]] = i;
    }

    console.log(alpa.join(' '));
}

solution(input);
