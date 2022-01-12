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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    const std::vector<double> v7 = v1[0];
    const std::vector<double> v9 = v1[0];
    const double v3 = v9[0];
    const double v10 = v9[0];
    const double v11 = v7[0];
    const double v6 = v7[0];
    const std::vector<double> v29 = v1[0];
    const double v69 = v29[0];
    std::vector<double> v37 = v7;
    v37[0] = v3;
    double v43 = v6;
    const double v57 = v37[0];
    const double v116 = v57 / v11;
    v37[0] = v43;
    v37[0] = v69;
    double v79 = v10;
    v37[0] = v79;
    return v116;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } } });
    std::vector<std::vector<double>> v1({ { 10.0 } });
    double v2(11.0);
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
