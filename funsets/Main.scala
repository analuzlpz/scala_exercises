package funsets

import funsets.FunSets.{map, union}

object Main extends App:
  import FunSets.*
  //println(contains(singletonSet(1), 1))
  //println(forall(x => true, x => x == 1))
  var s = union(singletonSet(1),singletonSet(2))
  map(s, x => 1 + x)
