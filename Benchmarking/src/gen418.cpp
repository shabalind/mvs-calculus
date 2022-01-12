  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const std::vector<s0> v3 = v0[1];
    std::vector<s0> v2 = v3;
    std::vector<std::vector<s0>> v10 = v0;
    const std::vector<s0> v6 = v10[1];
    v10 = v0;
    v10[1] = v2;
    const s0 v13 = v2[0];
    const std::vector<std::vector<double>> v14 = v13.p1;
    const std::vector<s0> v11 = v0[1];
    v10[0] = v2;
    const std::vector<double> v40 = v14[0];
    v10[0] = v11;
    std::vector<s0> v41 = v6;
    v10 = v0;
    const s0 v170 = v41[0];
    v2[0] = v170;
    const double v130 = v40[0];
    return v130;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 } } } } });
    double v1(8.0);
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
