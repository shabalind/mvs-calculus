  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s0 p2;
    s1(s0 v0, std::vector<std::vector<s0>> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s6 {
    std::vector<s0> p0;
    s1 p1;
    s6(std::vector<s0> v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s6> &v0, const double &v1) {
    const s6 v9 = v0[0];
    const s1 v3 = v9.p1;
    const double v4 = v1 * v1;
    const s6 v5 = v0[0];
    const s0 v6 = v3.p2;
    const std::vector<std::vector<double>> v10 = v6.p0;
    const s1 v11 = v5.p1;
    const std::vector<double> v16 = v10[0];
    const s0 v49 = v11.p2;
    const std::vector<std::vector<double>> v24 = v49.p1;
    const double v32 = v1 + v4;
    const double v60 = v16[0];
    const std::vector<double> v45 = v24[1];
    const double v97 = v45[0];
    const double v81 = v60 + v32;
    const double v100 = v97 - v81;
    return v100;
  }
  int main() {
    std::vector<s6> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } }, { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } }, { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } } });
    double v1(36.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
