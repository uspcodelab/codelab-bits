const sum = (array) => array.reduce((acc, item) => (acc += item), 10);

const numbers = [1, 2, 3, 4, 5];
const sumNumbers = sum(numbers);

console.log("Sum: ", sumNumbers);
