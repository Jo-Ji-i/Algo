function solution(arr, queries) {
    let result = arr;

    for (item of queries) {
        const temp = result[item[0]];
        result[item[0]] = result[item[1]];
        result[item[1]] = temp;
    }

    return result;
}