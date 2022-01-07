#include <vector>
#include <cstdio>
#include "Benchmark.h"

struct State {
  public:
    std::vector<bool> freeRows;
    std::vector<bool> freeMaxs;
    std::vector<bool> freeMins;
    std::vector<int> queenRows;

    State() : freeRows(8, true), freeMaxs(16, true), freeMins(16, true), queenRows(16, -1) {
    }
};

bool getRowColumn(State &state, int r, int c) { 
  return state.freeRows[r] && state.freeMaxs[c + r] && state.freeMins[c - r + 7];
}

void setRowColumn(State &state, int r, int c, bool v) {
  state.freeRows[r] = v;
  state.freeMaxs[c + r] = v;
  state.freeMins[c - r + 7] = v;
}

bool placeQueen(State &state, int c) {
  for (int r = 0; r < 8; r++) {
    if (getRowColumn(state, r, c)) {
      state.queenRows[r] = c;
      setRowColumn(state, r, c, false);

      if (c == 7) {
        return true;
      }

      if (placeQueen(state, c + 1)) {
        return true;
      }

      setRowColumn(state, r, c, true);
    }
  }

  return false;
}

int run(int n) {
  State state;
  return placeQueen(state, 0) ? 1 : 0;
}
