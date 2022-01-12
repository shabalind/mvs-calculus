  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const s0 &v1, const double &v2) {
    const std::vector<std::vector<double>> v7 = v1.p1;
    const std::vector<std::vector<std::vector<double>>> v8 { v7, v7, v7 };
    const std::vector<std::vector<double>> v4 = v8[0];
    const std::vector<double> v6 = v4[0];
    std::vector<std::vector<double>> v22 = v7;
    const std::vector<double> v11 = v22[0];
    std::vector<double> v19 = v6;
    v22 = v7;
    const double v14 = v11[0];
    const std::vector<std::vector<double>> v24 = v1.p0;
    v19[0] = v14;
    v19[0] = v2;
    const std::vector<double> v25 = v24[1];
    v22[2] = v25;
    const double v41 = v2 - v14;
    v19[0] = v14;
    v19[0] = v2;
    const double v80 = v2 / v41;
    v22[0] = v19;
    return v80;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } });
    s0 v1({ { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } });
    double v2(10.0);
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
