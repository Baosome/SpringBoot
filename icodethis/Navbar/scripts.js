const navBarBtn = document.querySelector(".toggleNavBar");
const mainNavBar = document.querySelector(".mainBar");

navBarBtn.addEventListener("click", ()=> {
   mainNavBar.classList.toggle("closeNav");
});