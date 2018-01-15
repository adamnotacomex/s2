/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

/**
 *
 * @author adam
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Question7 question7 = new Question7();
        System.out.println(question7.execute(99, 7894));

        Question8 question8 = new Question8();
        BinaryTree b1 = new BinaryTree();
        BinaryTree b2 = new BinaryTree();
        BinaryTree b3 = new BinaryTree();
        BinaryTree b4 = new BinaryTree();

        b1.valor = 1;
        b1.right = b2;

        b2.valor = 2;
        b2.right = b3;
        b2.left = b1;

        b3.valor = 3;
        b3.left = b2;
        b3.right = b4;

        b4.valor = 4;
        b4.left = b3;

        System.out.println("TEST QUESTION 8");
        System.out.println(question8.getSomaNosSubSequente(b1));
        System.out.println(question8.getSomaNosSubSequente(b2));
        System.out.println(question8.getSomaNosSubSequente(b3));
        System.out.println(question8.getSomaNosSubSequente(b4));

    }

}
