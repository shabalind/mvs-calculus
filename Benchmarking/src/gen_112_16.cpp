  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f4(const double &v0) {
    double v3 = v0;
    double v2 = v3;
    double v8 = v0;
    double v9 = v8;
    double v22 = v2;
    double v10 = v22;
    double v37 = v3;
    const double v25 = v10 + v37;
    double v14 = v0;
    double v26 = v9;
    double v48 = v26;
    const std::vector<double> v89 { v22, v0 };
    std::vector<double> v40 = v89;
    std::vector<double> v24 = v40;
    v24[1] = v48;
    v40[0] = v26;
    v40[0] = v14;
    std::vector<double> v42 = v89;
    const std::vector<std::vector<double>> v35 { v40 };
    std::vector<std::vector<double>> v34 = v35;
    const std::vector<double> v50 = v34[0];
    v34[0] = v42;
    const double v73 = v42[1];
    const std::vector<double> v80 = v34[0];
    v34[0] = v24;
    v42[1] = v25;
    std::vector<std::vector<double>> v90 = v34;
    std::vector<std::vector<double>> v53 = v34;
    const double v118 = v50[0];
    v90[0] = v80;
    double v99 = v73;
    v40[0] = v99;
    v90 = v53;
    const std::vector<double> v95 = v90[0];
    v34[0] = v95;
    return v118;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const double v8 = f4(v1);
    const double v5 = f4(v8);
    const double v10 = f4(v5);
    return v10;
  }
  int main() {
    s2 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 } } }, { { { 7.0 }, { 8.0 }, { 9.0 } }, { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 } } } }, { { { 14.0 }, { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 } }, { { 19.0 }, { 20.0 } } } });
    double v1(21.0);
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
