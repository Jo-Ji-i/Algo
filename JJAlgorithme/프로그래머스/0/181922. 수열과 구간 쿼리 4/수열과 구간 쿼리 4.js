function solution(arr, queries) {
    let result = [...arr];

    queries.forEach(([s, e, k]) => {
        const answer = result.map((item, idx) => {
            if (idx >= s && idx <= e) {
                return idx % k === 0 ? item + 1 : item;
            } else return item;
        });
        result = [...answer];
    });

    return result;
}