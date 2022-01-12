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
    std::vector<std::vector<s0>> v5 = v0;
    std::vector<std::vector<s0>> v8 = v5;
    const std::vector<std::vector<std::vector<s0>>> v9 { v8, v5 };
    const std::vector<s0> v2 = v0[1];
    const std::vector<std::vector<s0>> v3 = v9[0];
    v5[1] = v2;
    const std::vector<s0> v15 = v3[2];
    const s0 v13 = v15[0];
    const std::vector<std::vector<double>> v11 = v13.p1;
    const std::vector<double> v21 = v11[0];
    const double v68 = v21[0];
    v8[1] = v2;
    v5[1] = v15;
    return v68;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } });
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
