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
    const std::vector<std::vector<double>> v6 = v0.p1;
    const std::vector<double> v3 = v6[0];
    const double v7 = v3[0];
    std::vector<double> v9 = v3;
    v9[0] = v7;
    const std::vector<double> v12 = v6[0];
    const double v23 = v3[0];
    const double v28 = v12[0];
    v9[0] = v23;
    v9[0] = v28;
    const double v65 = v9[0];
    return v65;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 } } });
    s0 v1({ { { 2.0 } }, { { 3.0 } } });
    double v2(4.0);
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
