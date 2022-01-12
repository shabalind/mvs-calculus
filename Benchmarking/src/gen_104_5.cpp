  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const s0 &v2, const s0 &v3, const double &v4) {
    const std::vector<double> v28 { v4, v4, v4 };
    const double v14 = v4 + v4;
    const double v31 = v28[1];
    std::vector<double> v40 = v28;
    const std::vector<double> v35 { v4, v4, v4, v4, v14 };
    const double v46 = v40[0];
    v40[0] = v31;
    std::vector<double> v74 = v40;
    v74[1] = v46;
    std::vector<double> v45 = v74;
    v45[0] = v46;
    const double v115 = v35[1];
    v74[1] = v115;
    std::vector<double> v152 = v45;
    const double v406 = v152[0];
    return v406;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } });
    s0 v1({ { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } });
    s0 v2({ { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } });
    s0 v3({ { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } });
    double v4(20.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
