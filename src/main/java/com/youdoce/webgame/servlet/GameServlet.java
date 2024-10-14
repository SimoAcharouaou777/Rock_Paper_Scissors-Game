package com.youdoce.webgame.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.eclipse.tags.shaded.org.apache.bcel.generic.Select;

import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GameServlet",urlPatterns = {"/game"})
public class GameServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
         request.getRequestDispatcher("view/game.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String [] PaRoSc = {"paper","rock","scissors"};
        Random random = new Random();
        int Select = random.nextInt(PaRoSc.length);
        String ComputerChoise = PaRoSc[Select];
        String playerChoice = request.getParameter("playerChoice");
        String result = "";
        String playerImage = "";
        String computerImage = "";
        if(playerChoice.equals(ComputerChoise)){
            result =" it's a Tie";
        } else if (playerChoice.equalsIgnoreCase("rock")) {
            if(ComputerChoise.equalsIgnoreCase("scissors")){
                result = "You win";
            } else if (ComputerChoise.equalsIgnoreCase("paper")) {
                result = "You lose";
            }
        } else if (playerChoice.equalsIgnoreCase("paper")) {
            if(ComputerChoise.equalsIgnoreCase("rock")){
                result = "You win";
            } else if (ComputerChoise.equalsIgnoreCase("scissors")) {
                result =" You lose";
            }
        } else if (playerChoice.equalsIgnoreCase("scissors")) {
            if(ComputerChoise.equalsIgnoreCase("rock")){
                result = "You lose";
            } else if (ComputerChoise.equalsIgnoreCase("paper")) {
                result = "You win";
            }
        }

        if(ComputerChoise.equalsIgnoreCase("rock")){
            computerImage = "images/fist.png";
        } else if (ComputerChoise.equalsIgnoreCase("scissors")) {
            computerImage = "images/scissors.png";
        } else if (ComputerChoise.equalsIgnoreCase("paper")) {
            computerImage ="images/hand-paper.png";
        }

        if(playerChoice.equalsIgnoreCase("rock")){
            playerImage = "images/fist.png";
        } else if (playerChoice.equalsIgnoreCase("scissors")) {
            playerImage = "images/scissors.png";
        } else if (playerChoice.equalsIgnoreCase("paper")) {
            playerImage ="images/hand-paper.png";
        }

        request.setAttribute("result",result);
        request.setAttribute("computerImage",computerImage);
        request.setAttribute("playerImage",playerImage);
        request.getRequestDispatcher("view/game.jsp").forward(request,response);
    }
}
