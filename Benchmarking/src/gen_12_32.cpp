  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s0 &v1, const double &v2) {
    const s0 v6 = v0[0];
    const std::vector<std::vector<double>> v4 = v6.p2;
    const std::vector<std::vector<double>> v7 = v1.p0;
    const std::vector<double> v13 = v4[1];
    const double v14 = v13[0];
    const std::vector<double> v21 = v7[0];
    double v16 = v14;
    const double v28 = v21[0];
    const double v34 = v28 * v14;
    const std::vector<double> v207 { v28, v34, v2, v16, v34, v16 };
    const double v91 = v207[1];
    return v91;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } } } });
    s0 v1({ { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 } } });
    double v2(24.0);
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
