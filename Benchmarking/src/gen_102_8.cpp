  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s0> &v1, const double &v2) {
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v6 = v0.p2;
    const std::vector<double> v9 = v4[0];
    const std::vector<std::vector<double>> v24 = v0.p2;
    const std::vector<double> v10 = v6[1];
    const double v21 = v9[0];
    const double v23 = v10[0];
    const std::vector<double> v42 = v24[1];
    const double v59 = v42[0];
    const std::vector<double> v34 { v21, v2, v21, v23, v59 };
    const double v37 = v34[3];
    return v37;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } });
    std::vector<s0> v1({ { { { 5.0 } }, { { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 } }, { { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } });
    double v2(15.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
