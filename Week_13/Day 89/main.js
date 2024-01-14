document.addEventListener("DOMContentLoaded", function () {
  // Get the input field and button elements
  var inputField = document.getElementById("inputField");
  var addButton = document.getElementById("addition");

  // Get the to-do container
  var toDoContainer = document.getElementById("toDocontainer");

  // Event listener for the "ADD" button
  addButton.addEventListener("click", function () {
    // Get the value from the input field
    var todoText = inputField.value;

    // Check if the input is not empty
    if (todoText.trim() !== "") {
      // Create a new div element for the to-do item
      var todoItem = document.createElement("div");
      todoItem.className = "todo-item";

      // Create a new span element for the to-do text
      var todoTextSpan = document.createElement("span");
      todoTextSpan.innerText = todoText;

      // Create a delete button for each to-do item
      var deleteButton = document.createElement("button");
      deleteButton.innerText = "Delete";
      deleteButton.className = "delete-button";

      // Event listener for the delete button
      deleteButton.addEventListener("click", function () {
        // Remove the parent div (to-do item) when delete is clicked
        todoItem.remove();
      });

      // Append the text and delete button to the to-do item div
      todoItem.appendChild(todoTextSpan);
      todoItem.appendChild(deleteButton);

      // Append the to-do item to the to-do container
      toDoContainer.appendChild(todoItem);

      // Clear the input field after adding the to-do item
      inputField.value = "";
    }
  });
});
