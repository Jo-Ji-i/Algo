const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = [];

rl.on('line', (line) => {
    input = line.split(' ').map((el) => Number(el));
    console.log(input[0] + input[1]);
    console.log(input[0] - input[1]);
    console.log(input[0] * input[1]);
    if (input[1] !== 0) {
        console.log(Math.floor(input[0] / input[1]));
        console.log(input[0] % input[1]);
    }

    rl.close();
});

rl.on('close', () => {
    process.exit();
});
