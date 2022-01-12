  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v7 = v0[0];
    const std::vector<std::vector<double>> v6 = v7.p1;
    const std::vector<double> v3 = v6[1];
    const std::vector<std::vector<double>> v11 { v3, v3, v3, v3, v3, v3 };
    const std::vector<double> v52 = v11[2];
    std::vector<std::vector<double>> v20 = v11;
    std::vector<double> v51 = v52;
    std::vector<double> v50 = v3;
    const std::vector<double> v140 = v20[0];
    v20[1] = v50;
    const double v68 = v140[0];
    const double v67 = v51[0];
    const double v304 = v68 / v67;
    return v304;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } });
    double v1(4.0);
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
