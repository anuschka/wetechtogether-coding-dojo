package org.example;

import java.util.ArrayList;
import java.util.List;

public class ChristmasTreeKata {

    public static List<String> drawChristmasTree(int n){
        List<String> tree = new ArrayList<>();

        // Handle case for n = 0 or undefined (if undefined, consider n=0 as default)
        if (n <= 0) {
            tree.add("no tree");
            return tree;
        }
        // Build the tree for valid n
        for (int i = 1; i < n; i++) {
            StringBuilder level = new StringBuilder();

            // Add leading spaces
            for (int j = i; j < n; j++) {
                level.append(" ");
            }

            // Add stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                level.append("x");
            }

            tree.add(level.toString());
        }

        // Add the trunk
        StringBuilder trunk = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            trunk.append(" ");
        }
        trunk.append("x");
        tree.add(trunk.toString());
        return tree; // Return the tree structure as a list of strings
    }

}
