document.addEventListener('DOMContentLoaded', () => {
    fetch('/api/fooditems')
        .then(response => response.json())
        .then(data => {
            const container = document.getElementById('food-items-container');
            data.forEach(item => {
                const div = document.createElement('div');
                div.className = 'food-item';
                div.innerHTML = `<h3 style="color:red; background-color:yellow;">${item.name}</h3><p>${item.description}</p><p>Price: $${item.price}</p>
                <p>${item.dilvery_Address}</p><p>${item.phone}</p>`;
                container.appendChild(div);
            });
        });
});
