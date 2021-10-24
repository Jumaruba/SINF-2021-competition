const { generateRandomInt } = require("../utils.js");

let elements = "";
const upperBound = -10000, lowerBound = 10000, N = generateRandomInt(1, 100000);
console.info(N);

for (let i = 0; i < N; i++) {
    elements += generateRandomInt(upperBound, lowerBound).toString();
    elements += " ";
}

console.info(elements);
