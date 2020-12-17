let student_id = document.getElementById('student-validation');
student_id.addEventListener('submit', async (e) => {
    e.preventDefault();
    e.stopPropagation();
    if (student_id.checkValidity() === true) {
        let response = await fetch("api/students/retrieve", {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json;charset=utf-8'
            },
            body: JSON.stringify({
                studentId: document.getElementById("studentId"),
            })
        });
        let result = await response;
        console.log(result);
        document.getElementById("demo").innerHTML = result.rollNumber;
    }
});
