  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    double v3 = v1;
    const double v8 = v1 * v3;
    double v4 = v8;
    double v2 = v4;
    v4 = v3;
    const std::vector<double> v14 { v4, v4, v2, v8, v4, v2, v1 };
    std::vector<double> v24 = v14;
    v24 = v14;
    v24[4] = v2;
    const double v42 = v24[5];
    std::vector<double> v51 = v24;
    const double v76 = v51[1];
    v51[3] = v42;
    return v76;
  }
  int main() {
    s1 v0({ { { { { 0.0 } }, { 1.0 } }, { { { 2.0 } }, { 3.0 } } }, { { { { 4.0 } }, { 5.0 } }, { { { 6.0 } }, { 7.0 } } } });
    double v1(8.0);
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
