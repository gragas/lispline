(def n 5)
(pipeline (node 'a        square  [(range 5)])
          (node 'b        cube    [(range 5)])
          (node 'c        sum     ['a 'b])
          (node 'c-logger println ['c]))

