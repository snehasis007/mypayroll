query book1Details {
bookById(id: "book-1") {
id
name
pageCount
author {
id
firstName
lastName
}
}
}

