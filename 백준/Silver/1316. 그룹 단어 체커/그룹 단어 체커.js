let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

function solution(item) {
    const test = item.slice(1, item[0] + 1);
    let result = 0;
    for (value of test) {
        result += wordChecker(value);
    }
    console.log(result);
}

function wordChecker(str) {
    const strr = str.split('');
    const seen = new Set();
    let prev = null;

    for (const ch of strr) {
        if (ch !== prev) {
            if (seen.has(ch)) {
                return 0;
            }
            seen.add(ch);
            prev = ch;
        }
    }
    return 1;
}

solution(input);
