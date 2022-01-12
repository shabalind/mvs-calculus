  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    std::vector<std::vector<s0>> p2;
    s0 p3;
    s1(s0 v0, s0 v1, std::vector<std::vector<s0>> v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<std::vector<s0>> p0;
    std::vector<s2> p1;
    s6(std::vector<std::vector<s0>> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  double f27(const double &v0) {
    double v3 = v0;
    double v5 = v0;
    double v2 = v3;
    v5 = v3;
    const double v13 = v0 + v2;
    double v6 = v3;
    double v8 = v13;
    const double v7 = v2 * v0;
    double v1 = v6;
    double v10 = v3;
    double v11 = v0;
    v2 = v13;
    double v4 = v5;
    double v14 = v4;
    const std::vector<double> v9 { v7, v7, v3, v10, v11 };
    std::vector<double> v12 = v9;
    std::vector<double> v17 = v12;
    double v23 = v1;
    v17[3] = v6;
    v17[0] = v23;
    double v42 = v0;
    v10 = v42;
    v17[2] = v8;
    const double v27 = v17[1];
    v17[3] = v14;
    return v27;
  }
  __attribute__((noinline))
  double f0(const s6 &v0, const std::vector<s1> &v1, const double &v2) {
    double v8 = v2;
    const double v30 = v8 / v8;
    const double v41 = f27(v2);
    const double v68 = v30 + v41;
    double v182 = v41;
    const double v175 = v68 * v182;
    return v175;
  }
  int main() {
    s6 v0({ { { { { { 0.0 } }, { 1.0 } } } }, { { { { { 2.0 } }, { 3.0 } }, { { { 4.0 } }, { 5.0 } } } } });
    std::vector<s1> v1({ { { { { 6.0 } }, { 7.0 } }, { { { 8.0 } }, { 9.0 } }, { { { { { 10.0 } }, { 11.0 } } }, { { { { 12.0 } }, { 13.0 } } }, { { { { 14.0 } }, { 15.0 } } } }, { { { 16.0 } }, { 17.0 } } }, { { { { 18.0 } }, { 19.0 } }, { { { 20.0 } }, { 21.0 } }, { { { { { 22.0 } }, { 23.0 } } }, { { { { 24.0 } }, { 25.0 } } }, { { { { 26.0 } }, { 27.0 } } } }, { { { 28.0 } }, { 29.0 } } }, { { { { 30.0 } }, { 31.0 } }, { { { 32.0 } }, { 33.0 } }, { { { { { 34.0 } }, { 35.0 } } }, { { { { 36.0 } }, { 37.0 } } }, { { { { 38.0 } }, { 39.0 } } } }, { { { 40.0 } }, { 41.0 } } } });
    double v2(42.0);
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
