
# Rock-Paper-Scissors Web Game

This is a **Java web application** that allows users to play the classic Rock-Paper-Scissors game against the computer. The game is built using **Servlets** and **JSP** with a clean and interactive user interface.

## Features

- Player can choose Rock, Paper, or Scissors.
- Computer makes a random choice.
- Game logic determines the winner and displays the result.
- Images of the player's and computer's choices are shown.
- Game results: Win, Lose, or Tie.

## Technologies Used

- **Java 17**
- **Jakarta EE (Servlets)**
- **JSP (Java Server Pages)**
- **Tomcat 10**
- **Maven**
- **Tailwind CSS** for styling

## Project Structure

```
src/
│
├── main/
│   ├── java/
│   │   └── com/
│   │       └── youdoce/
│   │           └── webgame/
│   │               └── servlet/
│   │                   └── GameServlet.java
│   ├── resources/
│   └── webapp/
│       ├── images/
│       ├── view/
│       │   └── game.jsp
│       └── WEB-INF/
│           └── web.xml
```

## Setup and Installation

1. Clone the repository to your local machine.
   ```bash
   git clone <repository-url>
   ```

2. Open the project in **IntelliJ IDEA** or any IDE supporting Maven and Java EE.

3. Install the required dependencies with Maven:
   ```bash
   mvn clean install
   ```

4. Make sure you have **Tomcat 10** installed and configured in your IDE.

5. Run the project on Tomcat.

6. Access the game at:
   ```
   http://localhost:8080/game
   ```

## How to Play

1. Select one of the choices: Rock, Paper, or Scissors.
2. Click the submit button to see the result.
3. The result of the game will be displayed, along with the corresponding images of the player's and computer's choices.

## Screenshots

![Game Example](images/gameScreenShot.png)

## License

This project is licensed under the **MIT License**. See the [LICENSE](LICENSE) file for more information.

## Author

- **Mohamed Acharouaou**  
  [LinkedIn](https://www.linkedin.com/in/mohamed-acharouaou)

