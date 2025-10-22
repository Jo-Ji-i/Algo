function solution(control) {
    const operate = {
        1: 'w',
        '-1': 's',
        10: 'd',
        '-10': 'a',
    };

    return control.slice(1)
        .map((v, i) => {
            return operate[v - control[i]];
        })
        .join('');

    return result;

}


