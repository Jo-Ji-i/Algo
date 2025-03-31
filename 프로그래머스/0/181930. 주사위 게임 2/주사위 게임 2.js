function solution(a, b, c) {
    const abc = a + b + c;
    const abcPow2 = Math.pow(abc, 2) - 2 * (a * b + b * c + c * a);
    const abcPow3 = abc * (abcPow2 - a * b - b * c - c * a) + 3 * a * b * c;


    if(a === b && a === c) return abc*abcPow2*abcPow3;
    else if( a === b || b === c || a === c) return abc*abcPow2;
    else return abc; 
}