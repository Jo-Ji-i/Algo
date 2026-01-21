let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

function solution(item) {
    const input = item.slice(0, item.length);
    const arr = input.map((x) => x.split(''));
    const max = Math.max(...arr.map((el) => el.length));
    let temp = '';

    for (let row = 0; row < max; row++) {
        for (let i = 0; i < 5; i++) {
            let ch = arr[i][row];
            if (ch !== undefined) temp += ch;
        }
    }

    console.log(temp.replace(/ /g, ''));
}

solution(input);
