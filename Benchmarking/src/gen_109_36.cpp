  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s0 v2 = v0.p0;
    const std::vector<std::vector<double>> v3 = v2.p0;
    const std::vector<double> v5 = v3[0];
    const std::vector<std::vector<double>> v7 = v2.p0;
    const std::vector<std::vector<double>> v10 = v2.p0;
    const std::vector<double> v15 = v7[0];
    const std::vector<double> v9 = v10[0];
    const std::vector<std::vector<double>> v14 { v9, v5, v5, v15, v15 };
    const std::vector<double> v58 = v14[2];
    const double v51 = v58[0];
    return v51;
  }
  int main() {
    s1 v0({ { { { 0.0 } } }, { { { { { 1.0 } } } }, { { { { 2.0 } } } } } });
    double v1(3.0);
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
