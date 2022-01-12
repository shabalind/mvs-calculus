  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    std::vector<std::vector<s0>> p2;
    s1(s0 v0, s0 v1, std::vector<std::vector<s0>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<s1> v3 = v0[0];
    double v5 = v1;
    double v11 = v5;
    const s1 v7 = v3[0];
    const double v13 = v5 - v11;
    const s0 v14 = v7.p1;
    const std::vector<std::vector<double>> v26 = v14.p1;
    s0 v15 = v14;
    const std::vector<double> v23 = v15.p0;
    const std::vector<std::vector<double>> v19 { v23, v23, v23, v23 };
    std::vector<std::vector<double>> v24 = v19;
    v15.p0 = v23;
    const std::vector<double> v58 = v26[0];
    v24[1] = v23;
    v15.p0 = v23;
    std::vector<std::vector<double>> v46 = v24;
    const double v44 = v58[0];
    const std::vector<double> v36 = v46[0];
    const double v83 = v5 * v1;
    v5 = v44;
    v15.p1 = v26;
    const double v53 = v36[0];
    v46 = v24;
    const std::vector<double> v197 { v5, v13, v13, v83, v5, v44, v13 };
    v15.p0 = v36;
    const double v55 = v197[0];
    v15.p0 = v23;
    const double v74 = v53 / v55;
    return v74;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { 0.0, 1.0, 2.0 }, { { 3.0 } } }, { { 4.0, 5.0, 6.0 }, { { 7.0 } } }, { { { { 8.0, 9.0, 10.0 }, { { 11.0 } } } }, { { { 12.0, 13.0, 14.0 }, { { 15.0 } } } } } } } });
    double v1(16.0);
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
