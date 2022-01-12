  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<double> v3 = v7[1];
    std::vector<std::vector<double>> v11 = v7;
    v11[1] = v3;
    std::vector<double> v23 = v3;
    const double v10 = v23[0];
    v23[0] = v10;
    std::vector<std::vector<double>> v24 = v11;
    const std::vector<double> v15 = v24[1];
    const double v18 = v15[0];
    const double v28 = v18 + v1;
    std::vector<double> v25 = v23;
    std::vector<double> v128 = v25;
    const double v54 = v128[0];
    v25[0] = v1;
    v23[0] = v28;
    return v54;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } } });
    double v1(2.0);
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
