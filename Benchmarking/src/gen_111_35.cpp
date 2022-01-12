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
    const std::vector<s0> v3 = v0[0];
    const s0 v2 = v3[0];
    const std::vector<std::vector<double>> v5 = v2.p0;
    const std::vector<std::vector<double>> v18 = v2.p0;
    const s0 v17 = v3[0];
    const std::vector<double> v38 = v18[0];
    const std::vector<double> v21 = v5[1];
    const std::vector<std::vector<double>> v20 = v17.p1;
    std::vector<std::vector<double>> v39 = v20;
    v39[0] = v21;
    const std::vector<double> v29 = v39[0];
    v39[0] = v38;
    const double v111 = v29[0];
    const double v323 = v111 + v1;
    return v323;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } } });
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
