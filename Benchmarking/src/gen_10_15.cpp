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
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s0 v2 = v0.p0;
    const std::vector<std::vector<double>> v3 = v2.p0;
    std::vector<std::vector<double>> v6 = v3;
    const std::vector<double> v5 = v6[0];
    const std::vector<double> v7 { v1, v1, v1, v1, v1, v1, v1 };
    std::vector<double> v4 = v5;
    std::vector<double> v19 = v7;
    const double v48 = v19[2];
    const double v20 = v4[0];
    const double v30 = v20 * v48;
    return v30;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } });
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
