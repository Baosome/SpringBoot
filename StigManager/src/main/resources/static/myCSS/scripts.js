const navBarBtn = document.querySelector(".toggleNavBar");
const mainNavBar = document.querySelector(".mainBar");
const bootstrapContainer = document.querySelector(".container");

navBarBtn.addEventListener("click", ()=> {
   mainNavBar.classList.toggle("closeNav");
   bootstrapContainer.classList.toggle("closeNav")
});