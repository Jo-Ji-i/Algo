let fs = require('fs');

const input = fs.readFileSync('/dev/stdin').toString().trim().split(/\s+/);

function solution(item) {
    let arr = item.toString().toUpperCase().split('');
    console.log(getMode(arr));
}

function getMode(arr) {
    const counts = arr.reduce((pv, cv) => {
        pv[cv] = (pv[cv] || 0) + 1;
        return pv;
    }, {});

    const entries = Object.entries(counts);

    let maxCount = 0;
    for (const [, count] of entries) {
        if (count > maxCount) maxCount = count;
    }

    const modes = entries
        .filter(([, count]) => count === maxCount)
        .map(([value]) => value);

    if (modes.length > 1) {
        return '?';
    } else {
        return modes.toString();
    }
}

solution(input);
