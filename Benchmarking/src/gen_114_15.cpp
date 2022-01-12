  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f24(const double &v0) {
    const double v6 = v0 / v0;
    double v7 = v0;
    double v1 = v7;
    double v4 = v1;
    double v13 = v0;
    double v9 = v4;
    double v3 = v9;
    const double v15 = v13 * v13;
    const std::vector<double> v10 { v1, v9, v15, v3 };
    double v30 = v6;
    std::vector<double> v22 = v10;
    std::vector<double> v14 = v22;
    const double v28 = v22[0];
    double v46 = v28;
    v22[1] = v1;
    v22[1] = v4;
    v14[0] = v46;
    v3 = v6;
    v22[3] = v30;
    std::vector<double> v23 = v14;
    std::vector<double> v51 = v23;
    v51[1] = v28;
    const double v41 = v51[1];
    return v41;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const double v3 = f24(v1);
    double v5 = v3;
    v5 = v3;
    const double v38 = f24(v5);
    return v38;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } });
    double v1(12.0);
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
