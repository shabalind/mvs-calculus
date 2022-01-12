  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<double> &v0, const std::vector<std::vector<s1>> &v1, const s0 &v2, const double &v3) {
    std::vector<double> v7 = v0;
    v7[0] = v3;
    double v4 = v3;
    v7[0] = v4;
    v7[0] = v4;
    v7[0] = v4;
    std::vector<double> v6 = v7;
    const double v12 = v2.p0;
    const std::vector<std::vector<double>> v5 = v2.p1;
    const std::vector<std::vector<std::vector<double>>> v21 { v5, v5, v5, v5 };
    const std::vector<std::vector<double>> v19 = v21[2];
    const double v23 = v0[0];
    v6[0] = v4;
    v6[0] = v23;
    const std::vector<double> v56 = v19[0];
    v6[0] = v23;
    const double v42 = v12 / v3;
    std::vector<double> v37 = v56;
    v37 = v6;
    const double v194 = v37[0];
    v37[0] = v42;
    return v194;
  }
  int main() {
    std::vector<double> v0({ 0.0 });
    std::vector<std::vector<s1>> v1({ { { { 1.0, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { 5.0, { { 6.0 }, { 7.0 }, { 8.0 } } } } } } });
    s0 v2({ 9.0, { { 10.0 }, { 11.0 }, { 12.0 } } });
    double v3(13.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
