function solution(n) {
    let even = 0; 
    let odd = 0; 
    
    for (let i = n; i > 0; i--) {
        if (i % 2 === 0) even += Math.pow(i, 2);
        else odd += i;
    }
    return n % 2 === 0 ? even : odd;
}