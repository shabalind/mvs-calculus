  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const std::vector<s0> &v2, const std::vector<s0> &v3, const double &v4) {
    s0 v11 = v0;
    const s0 v10 = v2[0];
    const s0 v5 = v3[1];
    const std::vector<std::vector<double>> v21 = v11.p0;
    const std::vector<std::vector<double>> v29 = v10.p0;
    const std::vector<std::vector<double>> v45 = v5.p1;
    std::vector<std::vector<double>> v55 = v21;
    const std::vector<double> v63 = v21[1];
    v11.p1 = v45;
    v11.p0 = v55;
    const double v44 = v63[0];
    v11.p0 = v29;
    return v44;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 } } });
    s0 v1({ { { 3.0 }, { 4.0 } }, { { 5.0 } } });
    std::vector<s0> v2({ { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } });
    std::vector<s0> v3({ { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 } } } });
    double v4(18.0);
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
