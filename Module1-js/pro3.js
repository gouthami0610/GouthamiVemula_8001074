const events = [
    { name: "Music Fest", seats: 10, upcoming: true },
    { name: "Dance Show", seats: 0, upcoming: true },
    { name: "Old Event", seats: 20, upcoming: false }
];

events.forEach(event => {
    if (event.upcoming && event.seats > 0) {
        console.log(event.name);
    }
});

try {
    let seats = 0;

    if (seats <= 0) {
        throw new Error("No seats available");
    }

    seats--;
} catch (error) {
    console.log(error.message);
}