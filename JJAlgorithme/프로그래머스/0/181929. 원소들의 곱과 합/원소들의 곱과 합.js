function solution(num_list) {
 const mul = num_list.reduce((acc, cur) => {
        return acc * cur;
    });
    const plus = num_list.reduce((acc, cur) => {
        return acc + cur;
    });
    return mul > plus*plus ? 0 : 1;
}