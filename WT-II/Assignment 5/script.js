function checkNumber() {
    const number = document.getElementById("numberInput").value;
    const result = document.getElementById("result");

    if (number > 0) {
        result.innerHTML = "The number is positive.";
        result.style.color = "green";
    } else if (number < 0) {
        result.innerHTML = "The number is negative.";
        result.style.color = "red";
    } else {
        result.innerHTML = "The number is zero.";
        result.style.color = "gray";
    }
}
