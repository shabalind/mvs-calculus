  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1, const s1 &v2, const s1 &v3) {
    const std::vector<s0> v4 = v3.p0;
    const s0 v8 = v4[2];
    const std::vector<std::vector<double>> v17 = v8.p1;
    const std::vector<std::vector<double>> v15 = v8.p0;
    std::vector<std::vector<double>> v29 = v15;
    const std::vector<double> v16 = v17[0];
    const std::vector<double> v33 = v29[0];
    const double v81 = v33[0];
    const double v110 = v16[0];
    const double v98 = v81 / v110;
    double v107 = v98;
    return v107;
  }
  int main() {
    s1 v0({ { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } }, { { { { { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 } } } } } });
    double v1(10.0);
    s1 v2({ { { { { 11.0 } }, { { 12.0 } } }, { { { 13.0 } }, { { 14.0 } } }, { { { 15.0 } }, { { 16.0 } } } }, { { { { { 17.0 } }, { { 18.0 } } } }, { { { { 19.0 } }, { { 20.0 } } } } } });
    s1 v3({ { { { { 21.0 } }, { { 22.0 } } }, { { { 23.0 } }, { { 24.0 } } }, { { { 25.0 } }, { { 26.0 } } } }, { { { { { 27.0 } }, { { 28.0 } } } }, { { { { 29.0 } }, { { 30.0 } } } } } });
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
