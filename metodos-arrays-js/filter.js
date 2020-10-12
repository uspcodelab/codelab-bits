const filterNumbers = (array) => array.filter((item) => item > 2);

const numbers = [1, 2, 3, 4, 5];

const newArray = filterNumbers(numbers);

console.log("Array original: ", numbers);
console.log("Filtered array: ", newArray);
