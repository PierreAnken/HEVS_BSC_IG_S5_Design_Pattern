package TemplateMethodAndComposite_1;

public class __ExerciceData {

/*
    The goal of this exercize is that you apply the template method on the composite pattern.
    When you need to search for a solution in a tree (a specific leaf node), then you need to traverse the tree until you find this node. Two typical possible traversal algorithms are the following: depth-first (DFS) and breadth-first (BFS):
            - DFS visits first the first child, then the child of the first child, etc., and comes one step back when all children of one node have been visited.
            - BFS visits the tree layer by layer, thus first all children of one node, then the children of the children, etc.
    The following pictures show examples of those two algorithms (the numbers indicate the order of traversal):

    These two algorithms have the same structure, starting with a list of nodes Q including the root node:

    Search (startingNode)
        Q <- makeList(startingNode)
            REPEAT
                IF Q is empty THEN
                    RETURN FAILURE.
                ELSE
                    n <- first(Q)
                    Q <- rest(Q)
                    IF n is a solution THEN
                        RETURN n
                    ELSE
                        S <- n.getSuccessors()
                        Q <- addSuccessors(Q,S)
                    END IF
                END IF
            END REPEAT
    END Search

    addSuccessors makes the difference between DFS and BFS:
        - inDFS,Q=S+Q
        - inBFS,Q=Q+S

    Define and implement the class SearchAlgorithm that implements the abstract search.

    Define then two classes DFS and BFS, subclasses of SearchAlgorithm,
    which implement the method addSuccessors as a template method.

    Test your algorithm and give an output of the traversal.
*/

}
