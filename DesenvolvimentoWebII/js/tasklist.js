const url = 'http://localhost:8080/tasks'
let tasklist;

document.onreadystatechange = () => {
    if (document.readyState === 'complete') {
        taskgetAll();
    }
}

const taskgetAll = () => {
    $.getJSON(`${url}/all`, function (data) {
        FileList(data);
    })
}

const FileList = (tasks) => {
    tasklist = tasks;
    const ul = $("<ul>");
    tasklist.forEach(e => {
        const li = $("<li>");
        const chk = $(`<input type='checkbox' id='${e.id}' value='${e.id}'onclick='markToggle(this.value)' ${(e.status == 'DONE') ? 'checked' : ''} >`);
        const lbl = $(`<label for='${e.id}'> ${e.description}</label>`);
        const btn = $(`<button id='d-${e.id}' onclick='deleteTask(this.id)'> Excluir</button>`);
        ul.append(li.append(chk, lbl, btn));
       

    })
    $("#task-list").empty();
    $("#task-list").append(ul);

}

const taskCreate = () => {
    const description = $("#addtask-desc").val();
    const body = `{"description" : "${description}"}`;
    $.ajax({
        url: url,
        type: 'POST',
        contentType: 'application/json',
        dataType: 'json',
        data: body,
        success: (res) => {
            console.log(res);
            taskgetAll();
        }
    });


}

const deleteTask = (taskId) => {
    console.log(taskId);
    const id = taskId.substring(2);

    $.ajax({
        url: `${url}/${id}`,
        type: 'DELETE',
        contentType: 'application/json',
        dataType: 'json',
       
        success: (res) => {
            console.log(res);
            taskgetAll();
        }
    });
}


const markToggle = (taskId) => {
    const t = tasklist.find(e => e.id == taskId);
    const description = $("#addtask-desc").val();
    //"  ${description}"
    const body = `{"description":"${t.description}"   ,"status":"${(t.status == 'DONE') ? 'PENDING' : 'DONE'}"}`;
    console.log(t);
    $.ajax({
        url: `${url}/${t.id}`,
        type: 'PUT',
        contentType: 'application/json',
        dataType: 'json',
        data: body,
        success: (res) => {
            console.log(res);
            taskgetAll();
        },
        error: (err) => {
            console.error(err);
        }
    });


}