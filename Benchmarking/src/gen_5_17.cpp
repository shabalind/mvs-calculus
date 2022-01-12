  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(double v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    s1 p1;
    s4(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s4> p0;
    s1 p1;
    s7(std::vector<s4> v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s7 &v0, const double &v1) {
    double v2 = v1;
    s7 v3 = v0;
    const s1 v11 = v3.p1;
    const double v21 = v1 * v2;
    const s0 v14 = v11.p0;
    const std::vector<double> v17 { v2, v21, v2 };
    const double v23 = v17[0];
    const double v37 = v17[1];
    const double v25 = v17[2];
    const double v34 = v14.p0;
    const std::vector<std::vector<double>> v60 = v14.p1;
    const std::vector<double> v58 = v60[0];
    const double v46 = v58[0];
    const double v63 = v17[2];
    v2 = v63;
    const std::vector<double> v78 { v23, v25, v37, v46, v1, v34, v37 };
    const double v87 = v78[4];
    return v87;
  }
  int main() {
    s7 v0({ { { { 0.0, { { 1.0 } }, { { 2.0 } } }, { { 3.0, { { 4.0 } }, { { 5.0 } } }, { { 6.0, { { 7.0 } }, { { 8.0 } } }, { 9.0, { { 10.0 } }, { { 11.0 } } } } } }, { { 12.0, { { 13.0 } }, { { 14.0 } } }, { { 15.0, { { 16.0 } }, { { 17.0 } } }, { { 18.0, { { 19.0 } }, { { 20.0 } } }, { 21.0, { { 22.0 } }, { { 23.0 } } } } } } }, { { 24.0, { { 25.0 } }, { { 26.0 } } }, { { 27.0, { { 28.0 } }, { { 29.0 } } }, { 30.0, { { 31.0 } }, { { 32.0 } } } } } });
    double v1(33.0);
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
