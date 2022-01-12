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
  double f19(const double &v0) {
    double v7 = v0;
    double v1 = v7;
    double v5 = v1;
    double v6 = v0;
    double v2 = v5;
    double v4 = v1;
    double v10 = v1;
    double v3 = v6;
    const double v12 = v1 / v5;
    v5 = v10;
    double v8 = v12;
    double v27 = v8;
    double v29 = v3;
    double v23 = v8;
    const std::vector<double> v31 { v27, v1, v4, v29, v1 };
    std::vector<double> v36 = v31;
    const double v40 = v31[0];
    v36[4] = v40;
    v36[1] = v1;
    const double v41 = v36[4];
    const double v63 = v41 + v2;
    v36[0] = v23;
    return v63;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const double v5 = f19(v1);
    const double v7 = f19(v5);
    double v4 = v1;
    const double v9 = f19(v1);
    const double v24 = f19(v7);
    const double v47 = v24 + v9;
    const double v83 = v4 * v47;
    return v83;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } } }, { { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } } }, { { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } });
    double v1(24.0);
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
