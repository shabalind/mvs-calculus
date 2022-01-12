  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    std::vector<s1> v4 = v0;
    std::vector<s1> v5 = v0;
    const s1 v11 = v5[1];
    const s0 v13 = v11.p1;
    const std::vector<std::vector<double>> v12 = v13.p0;
    const s1 v16 = v0[0];
    const std::vector<double> v31 = v12[0];
    std::vector<double> v33 = v31;
    v5[1] = v16;
    const double v83 = v33[0];
    v5 = v4;
    return v83;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { 4.0 } }, { { 5.0 } } } }, { { { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } } }, { { { 10.0 } }, { { 11.0 } } } } });
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
