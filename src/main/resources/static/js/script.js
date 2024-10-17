document.addEventListener('DOMContentLoaded', function() {
    const sidebar = document.getElementById('sidebar');
    const dashboardStats = document.getElementById('dashboard-stats');

    // Example: Toggling the sidebar visibility
    document.querySelector('.header-title h1').addEventListener('click', function() {
        sidebar.classList.toggle('hidden');
    });

    // Example: Reset filters
    window.resetFilters = function() {
        document.querySelector('.table-filters input[type="date"]').value = '';
        document.querySelectorAll('.table-filters select').forEach(select => select.selectedIndex = 0);
        // Add logic to reset the table data if needed
    };

    // Example: Dynamically update statistics
    function updateStatistics() {
        const stats = [
            { title: 'Class', value: 'Thêm Sức 2C', change: '8.5% Up from yesterday' },
            { title: 'Grade', value: 'Thêm Sức 2', change: '1.3% Up from past week' },
            { title: 'Ngành', value: 'Thiếu', change: '4.3% Down from yesterday' },
            { title: 'Đoàn', value: 'HTT', change: '1.8% Up from yesterday' }
        ];

        dashboardStats.innerHTML = '';
        stats.forEach(stat => {
            const statDiv = document.createElement('div');
            statDiv.classList.add('stat');
            statDiv.innerHTML = `
                <div class="stat-content">
                    <h3>${stat.title}</h3>
                    <p>${stat.value}</p>
                    <small>${stat.change}</small>
                </div>
            `;
            dashboardStats.appendChild(statDiv);
        });
    }

    updateStatistics();
});
