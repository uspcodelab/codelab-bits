const double = (array) => array.map((item) => item * 2);
const triple = (array) => array.map((item) => item * 3);

const numbers = [10, 20, 30, 40, 50];

console.log("Array original: ", numbers);
console.log("Array x 2: ", double(numbers));
console.log("Array x 3: ", triple(numbers));
