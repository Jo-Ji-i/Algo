function solution(list) {
    const last = list.pop();
    const before = list[list.length - 1];

    if (before < last) {
        list.push(last, last - before);
    } else {
        list.push(last, last * 2);
    }

    return(list);
}