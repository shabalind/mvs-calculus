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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  double f59(const double &v0) {
    double v4 = v0;
    double v1 = v0;
    double v18 = v4;
    double v21 = v1;
    const std::vector<double> v40 { v18 };
    std::vector<double> v22 = v40;
    std::vector<double> v33 = v22;
    v22[0] = v21;
    const double v39 = v33[0];
    return v39;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    double v5 = v1;
    v5 = v1;
    v5 = v1;
    const double v16 = f59(v5);
    double v35 = v16;
    const double v54 = v35 - v35;
    v35 = v16;
    v5 = v35;
    const double v140 = v54 - v1;
    return v140;
  }
  int main() {
    s1 v0({ { { { 0.0 } }, { { 1.0 } } }, { { { { { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 } }, { { 5.0 } } } } } });
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
