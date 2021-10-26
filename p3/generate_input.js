const { generateRandomInt } = require("../utils.js");

const maxGrid = Math.pow(10, 9);        // Max size for the grid[i][j] value.
const maxSize = 100;                    // Max m and n for the matrix.

const m = generateRandomInt(1, maxSize);
const n = generateRandomInt(1, maxSize);

let line = "";

console.info(`${m} ${n}`);
for (let i = 0; i < m; i++) {
    for (let j = 0; j < n; j++) {
        line += `${generateRandomInt(0, maxGrid)} `;
    }
    console.info(line);
    line = "";
}
