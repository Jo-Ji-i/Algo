function solution(arr, queries) {
    let result = arr;

    queries.forEach(([a, b]) => {
        [arr[a], arr[b]] = [arr[b], arr[a]];
    });
    console.log(result);
    return result;
}
