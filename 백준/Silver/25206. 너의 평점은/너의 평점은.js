let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split('\n');

const GRADE = {
    'A+': 4.5,
    A0: 4.0,
    'B+': 3.5,
    B0: 3.0,
    'C+': 2.5,
    C0: 2.0,
    'D+': 1.5,
    D0: 1.0,
    F: 0.0,
};

function solution(item) {
    let count = 0.0;
    let Gcount = 0.0;
    for (const value of item) {
        const [, credit, subject] = value.split(/\s+/);
        const grade = parseFloat(credit);

        if (subject === 'P') {
            continue;
        }

        Gcount += grade;
        count += grade * GRADE[subject];
    }
    const result = count / Gcount;
    console.log(result.toFixed(6));
}

solution(input);
