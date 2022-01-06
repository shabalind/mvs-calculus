struct State {
  var freeRows: [Bool]
  var freeMaxs: [Bool]
  var freeMins: [Bool]
  var queenRows: [Int]   
}

func run(_ input: String) -> Bool {
  var state = State(
    freeRows: Array(repeating: true, count: 8),
    freeMaxs: Array(repeating: true, count: 16),
    freeMins: Array(repeating: true, count: 16),
    queenRows: Array(repeating: -1, count: 16))

  return placeQueen(&state, 0)
}

func placeQueen(_ state: inout State, _ c: Int) -> Bool {
  for r in 0..<8 {
    if getRowColumn(&state, r, c) {
      state.queenRows[r] = c
      setRowColumn(&state,r, c, false)

      if (c == 7) {
        return true
      }

      if (placeQueen(&state, c + 1)) {
        return true
      }
      setRowColumn(&state, r, c, true)
    }
  }

  return false
}

func getRowColumn(_ state: inout State, _ r: Int, _ c: Int) -> Bool { 
  return state.freeRows[r] && state.freeMaxs[c + r] && state.freeMins[c - r + 7]
}

func setRowColumn(_ state: inout State, _ r: Int, _ c: Int, _ v: Bool) {
  state.freeRows[r] = v
  state.freeMaxs[c + r] = v
  state.freeMins[c - r + 7] = v
}

// true
print(run(""))
