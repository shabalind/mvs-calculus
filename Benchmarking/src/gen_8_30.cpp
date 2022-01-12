  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<s1> v7 = v0[0];
    const s1 v3 = v7[0];
    const s0 v2 = v3.p1;
    const std::vector<std::vector<double>> v17 = v2.p2;
    const std::vector<double> v27 = v17[0];
    const double v43 = v27[0];
    double v47 = v43;
    const double v91 = v47 / v47;
    const double v64 = v27[0];
    const double v90 = v64 / v91;
    v47 = v43;
    return v90;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 } }, { { 9.0 } } } } }, { { { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 } }, { { 19.0 } } } } }, { { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } }, { { 24.0 } } }, { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 } }, { { 29.0 } } } } } });
    double v1(30.0);
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
