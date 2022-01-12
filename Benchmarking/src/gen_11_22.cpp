  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s4(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s0> p0;
    std::vector<std::vector<s4>> p1;
    s5(std::vector<s0> v0, std::vector<std::vector<s4>> v1): p0(v0), p1(v1) { }
  };
  s0 f26(const s5 &v0, const s0 &v1) {
    const std::vector<s5> v5 { v0, v0, v0, v0, v0 };
    const s5 v10 = v5[3];
    const std::vector<std::vector<s4>> v11 = v10.p1;
    const std::vector<s4> v14 = v11[1];
    const s4 v24 = v14[0];
    const s4 v41 = v14[0];
    s4 v38 = v41;
    const std::vector<s0> v87 = v38.p1;
    const std::vector<s0> v56 = v24.p1;
    v38.p1 = v87;
    const std::vector<s0> v119 = v38.p0;
    v38.p1 = v56;
    const s0 v90 = v119[0];
    return v90;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const s5 &v1, const s0 &v2, const double &v3) {
    const s0 v9 = f26(v1, v2);
    const std::vector<std::vector<double>> v40 = v9.p1;
    const std::vector<double> v149 = v40[1];
    const double v157 = v149[0];
    return v157;
  }
  int main() {
    s4 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } }, { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } }, { { { { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } } });
    s5 v1({ { { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { { { { 24.0 }, { 25.0 } }, { { 26.0 }, { 27.0 } } }, { { { 28.0 }, { 29.0 } }, { { 30.0 }, { 31.0 } } } }, { { { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } } } }, { { { { { { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 } } } }, { { { { 44.0 }, { 45.0 } }, { { 46.0 }, { 47.0 } } } } } } } });
    s0 v2({ { { 48.0 }, { 49.0 } }, { { 50.0 }, { 51.0 } } });
    double v3(52.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
