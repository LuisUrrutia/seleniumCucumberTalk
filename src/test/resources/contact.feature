# language: es

Característica: Contactar a resIT
  Como posible cliente
  Quiero contactar a resIT
  Para contratarlos y me desarrollen la aplicación “NipAlert”

  Antecedentes:
    Dado que estoy en la página de resIT

  Esquema del escenario: Realizar contacto
    Dado que he realizado clic en contacto
    Y que he ingresado mi nombre <name>
    Y que he dado mi correo electrónico <email>
    Y que he ingresado mi mensaje <message>
    Cuando presione el botón enviar
    Entonces mi mensaje se debería haber enviado

  Ejemplos:
    | name          | email                | message                                 |
    | Juanito Perez | juanito@nipalert.com | Quiero mi aplicación NipAlert ahora ya! |
    | Luis Urrutia  | luis@urrutia.me      | Quier café, no hay en la oficina :(     |
    | Evelyn        | evelyn@resit.cl      | Quiero café coño!                       |