  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const std::vector<double> v8 { v1, v1, v1, v1 };
    const std::vector<double> v2 { v1, v1 };
    const double v16 = v8[3];
    const double v19 = v2[0];
    std::vector<double> v10 = v8;
    const double v15 = v10[2];
    const std::vector<double> v24 { v16, v19, v19, v15, v15, v19 };
    v10 = v8;
    std::vector<double> v27 = v24;
    const double v70 = v27[4];
    v10[1] = v16;
    v10[0] = v1;
    return v70;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { 2.0 } }, { { { 3.0 }, { 4.0 } }, { 5.0 } } });
    double v1(6.0);
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
