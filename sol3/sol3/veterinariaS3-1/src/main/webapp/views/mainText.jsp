document.addEventListener('DOMContentLoaded', function() {
// Fetch content from external file and insert it into the #mainText div
fetch('mainTextContent.txt')
.then(response => response.text())
.then(data => {
document.getElementById('mainText').innerHTML = data;
})
.catch(error => console.error('Error fetching mainTextContent.txt:', error));
});
