  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  std::vector<s0> f3(const std::vector<s0> &v0) {
    const std::vector<std::vector<s0>> v4 { v0, v0, v0, v0, v0, v0 };
    std::vector<std::vector<s0>> v18 = v4;
    const std::vector<s0> v40 = v18[2];
    const std::vector<s0> v43 = v18[1];
    v18[4] = v43;
    v18[3] = v0;
    v18[2] = v40;
    std::vector<s0> v48 = v43;
    return v48;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const std::vector<s0> v2 = f3(v0);
    const s0 v4 = v2[0];
    const s0 v6 = v0[0];
    const std::vector<std::vector<double>> v13 = v4.p1;
    const std::vector<double> v33 = v13[0];
    const double v14 = v33[0];
    const std::vector<std::vector<double>> v43 = v6.p1;
    const std::vector<double> v26 = v43[1];
    const double v23 = v26[0];
    double v73 = v14;
    v73 = v23;
    return v73;
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
