const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let result = '';

rl.on('line', (line) => {
    result += line + '??!';
    console.log(result);
    rl.close();
});

rl.on('close', () => {
    process.exit();
});
