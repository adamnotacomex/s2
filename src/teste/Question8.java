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
public class Question8 {

    public int getSomaNosSubSequente(BinaryTree binaryTree) {
        int result = 0;
        boolean existe = binaryTree.right != null;
        BinaryTree proximo = binaryTree.right;
        while (existe) {
            result += proximo.valor;
            proximo = proximo.right;

            existe = proximo != null;
        }

        return result;
    }
}
