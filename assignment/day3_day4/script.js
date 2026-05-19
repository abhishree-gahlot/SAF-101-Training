const form = document.getElementById("registrationForm");
const nameInput = document.getElementById("name");
const emailInput = document.getElementById("email");
const contactInput = document.getElementById("contact");
const addressInput = document.getElementById("address");
const passwordInput = document.getElementById("password");

const isRequired = (value) => value.trim() !== "";
const isValidEmail = (email) => {
    const pattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return pattern.test(email);
};
const isValidPhone = (phone) => {
    const pattern = /^[0-9]{10}$/;
    return pattern.test(phone);
};

function setError(input) 
{
    input.classList.add("error");
    input.classList.remove("success");
}

function setSuccess(input) 
{
    input.classList.add("success");
    input.classList.remove("error");
}

function setError(input) {
    input.classList.add("error");
    input.classList.remove("success");
}

function setSuccess(input) {
    input.classList.add("success");
    input.classList.remove("error");
}

form.addEventListener("submit", function (event) {
    event.preventDefault();
    let valid = true;

    if (!isRequired(nameInput.value)) 
    {
        setError(nameInput);
        valid = false;
    } 
    else 
    {
        setSuccess(nameInput);
    }

    if (!isRequired(emailInput.value) || !isValidEmail(emailInput.value)) 
    {
        setError(emailInput);
        valid = false;
    } 
    else 
    {
        setSuccess(emailInput);
    }

    if (!isRequired(contactInput.value) || !isValidPhone(contactInput.value)) 
    {
        setError(contactInput);
        valid = false;
    } 
    else 
    {
        setSuccess(contactInput);
    }

    if (!isRequired(addressInput.value)) 
    {
        setError(addressInput);
        valid = false;
    } 
    else 
    {
        setSuccess(addressInput);
    }

    if (!isRequired(passwordInput.value) || passwordInput.value.length < 6) 
    {
        setError(passwordInput);
        valid = false;
    } 
    else 
    {
        setSuccess(passwordInput);
    }

    if (valid) 
    {
        alert("Registration Successful!");
        form.reset();
    } 
    else 
    {
        alert("Please fix errors in the form!");
    }
});