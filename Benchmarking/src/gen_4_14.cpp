  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v3 = v0[0];
    const s1 v11(v3, v0);
    const s0 v12 = v0[0];
    const s0 v20 = v11.p0;
    const std::vector<std::vector<double>> v26 = v20.p1;
    const std::vector<double> v25 = v26[1];
    const std::vector<std::vector<double>> v23 = v12.p1;
    std::vector<std::vector<double>> v96 = v23;
    const std::vector<double> v72 = v96[0];
    const std::vector<double> v100 = v26[0];
    v96[1] = v100;
    const double v132 = v72[0];
    v96[1] = v25;
    return v132;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 } } } });
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
