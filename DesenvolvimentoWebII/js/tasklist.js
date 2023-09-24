const url = 'http://localhost:8080/tasks'
let tasklist;

document.onreadystatechange = () => {
    if (document.readyState === 'complete') {
        taskgetAll();
    }
}

const taskgetAll = () => {
  $.getJSON(`${url}/all`, function(data) {
    FileList(data);    
    })
}

const FileList = (tasks) => {
    tasklist = tasks;
    const ul = $("<ul>");
    tasklist.forEach(e =>{
        const li = $("<li>");
        const chk = $(`<input type='checkbox' id='${e.id}' value='${e.id}'>`);
        const lbl = $(`<label for='${e.id}'> ${e.description}</label>`);
        ul.append(li.append(chk).append(lbl));

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

const taskDelete = () => {
    const selectedTasks = [];
    $("input[type='checkbox']:checked").each(function() {
        selectedTasks.push($(this).val());
    });

    if (selectedTasks.length === 0) {
        alert("Selecione pelo menos uma tarefa para excluir.");
        return;
    }

    $.ajax({
        url: `${url}/delete`,
        type: 'DELETE',
        contentType: 'application/json',
        dataType: 'json',
        data: JSON.stringify(selectedTasks),
        success: (res) => {
            console.log(res);
            taskgetAll();
        },
        error: (err) => {
            console.error(err);
        }
    });
}
