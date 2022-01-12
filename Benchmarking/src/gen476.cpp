  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<std::vector<s0>> &v1, const double &v2) {
    double v6 = v2;
    const double v9 = v2 + v6;
    double v5 = v2;
    v6 = v5;
    v6 = v9;
    v5 = v2;
    const std::vector<double> v7 { v6, v2, v2, v5, v5 };
    std::vector<double> v16 = v7;
    v16[4] = v9;
    v16[4] = v5;
    double v44 = v5;
    v16[2] = v44;
    v16[0] = v5;
    std::vector<double> v48 = v16;
    v48[3] = v2;
    const double v72 = v48[3];
    return v72;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 } } });
    std::vector<std::vector<s0>> v1({ { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } });
    double v2(6.0);
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
