  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s0> p0;
    s5(std::vector<s0> v0): p0(v0) { }
  };
  __attribute__((noinline))
  double f0(const s5 &v0, const double &v1) {
    const std::vector<s0> v4 = v0.p0;
    const std::vector<s0> v7 = v0.p0;
    const s0 v6 = v4[0];
    const s0 v24 = v7[1];
    const std::vector<std::vector<double>> v19 = v24.p0;
    const std::vector<std::vector<double>> v14 = v6.p0;
    const std::vector<double> v30 = v19[0];
    std::vector<std::vector<double>> v51 = v14;
    const std::vector<double> v60 = v51[0];
    v51[0] = v30;
    const double v81 = v60[0];
    return v81;
  }
  int main() {
    s5 v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } });
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
