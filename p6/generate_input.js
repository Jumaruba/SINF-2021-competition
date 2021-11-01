const { generateRandomInt } = require("../utils.js");

let kEventsMax = Math.pow(10, 6);
let dayMax = Math.pow(10, 9);

let kEvents = generateRandomInt(1, kEventsMax);
let k = generateRandomInt(1, kEvents);
let events = Math.floor(kEvents / k);

console.log(`${events} ${k}`);
for (let i = 0; i < events; i++) {
    let startDay = generateRandomInt(1, dayMax);
    let endDay = generateRandomInt(startDay, dayMax);
    let value = generateRandomInt(1, kEventsMax);
    console.log(`${startDay} ${endDay} ${value}`);
}

