<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Rock Paper Scissors</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-900 text-white font-sans min-h-screen flex items-center justify-center">

<div class="text-center">
    <!-- Title -->
    <h1 class="text-4xl font-bold mb-8 text-yellow-400 animate-bounce">Rock, Paper, Scissors!</h1>

    <!-- Game Instructions -->
    <p class="text-xl mb-4">Choose your option to play:</p>

    <!-- Form to submit the player's choice -->
    <form action="${pageContext.request.contextPath}/game" method="POST" class="mb-8">
        <div class="flex justify-center space-x-8">
            <button name="playerChoice" value="rock" type="submit" class="focus:outline-none">
                <img src="images/fist.png" alt="Rock" class="h-24 w-24 hover:scale-110 transition transform duration-300">
                <p class="mt-2">Rock</p>
            </button>
            <button name="playerChoice" value="paper" type="submit" class="focus:outline-none">
                <img src="images/hand-paper.png" alt="Paper" class="h-24 w-24 hover:scale-110 transition transform duration-300">
                <p class="mt-2">Paper</p>
            </button>
            <button name="playerChoice" value="scissors" type="submit" class="focus:outline-none">
                <img src="images/scissors.png" alt="Scissors" class="h-24 w-24 hover:scale-110 transition transform duration-300">
                <p class="mt-2">Scissors</p>
            </button>
        </div>
    </form>

    <!-- Display Player vs Computer Results -->
    <div class="flex justify-around mb-8">
        <div class="text-center">
            <h2 class="text-2xl font-semibold">You</h2>
            <div id="player-choice" class="mt-4">
                <img src="<%= request.getAttribute("playerImage") %>" alt="Your choice" class="h-20 w-20" >
            </div>
        </div>
        <div class="text-center">
            <h2 class="text-2xl font-semibold">Computer</h2>
            <div id="computer-choice" class="mt-4">
                <img src="<%= request.getAttribute("computerImage") %>" alt="Computer choice" class="h-20 w-20">
            </div>
        </div>
    </div>

    <!-- Result Text -->
    <div id="result-text" class="text-2xl font-bold text-green-400 mb-6">
        <%= request.getAttribute("result") %>
    </div>

    <!-- Play Again Button -->

</div>

</body>
</html>
