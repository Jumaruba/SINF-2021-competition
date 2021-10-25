const { generateRandomInt } = require("../utils.js");

const range = 1000;
const totalElements = generateRandomInt(1, range/10);
console.info(totalElements);


let start, end, slice;
const overlapping = generateRandomInt(1, range);  // aprox number of overlapping elements.
const groups = totalElements / overlapping;

for (let i = 0; i < groups; i++) {
    slice = Math.floor(range / overlapping);
    for (let j = 1; j < overlapping + 1; j++) {
        start = generateRandomInt((slice * (j - 1)) + 1, slice * j).valueOf();
        end = generateRandomInt(start, slice * j).valueOf();
        console.info(`${start} ${end}`);
    }
}
