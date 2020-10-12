const users = [
  {
    id: 1,
    name: "Erick",
    email: "erick@erick.com",
  },
  {
    id: 2,
    name: "Marcelo",
    email: "marcelo@marcelo.com",
  },
  {
    id: 3,
    name: "Lissandra",
    email: "lissandra@lissandra.com",
  },
];

const email = "marcelo@marcelo.com";

// Buscando o usuário
const user = users.find((user) => {
  return user.email === email;
});

console.log("Usuário: ", user);
