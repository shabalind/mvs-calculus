  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    double p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, double v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s0 p2;
    s1 p3;
    std::vector<s1> p4;
    s2(s0 v0, std::vector<s0> v1, s0 v2, s1 v3, std::vector<s1> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  double f107(const double &v0) {
    double v5 = v0;
    double v6 = v5;
    double v2 = v5;
    double v1 = v2;
    v2 = v5;
    double v4 = v5;
    const double v3 = v6 * v2;
    double v11 = v4;
    const double v10 = v11 / v3;
    double v19 = v0;
    double v15 = v11;
    const std::vector<double> v12 { v11, v15, v10, v19, v1, v4 };
    std::vector<double> v21 = v12;
    v21[2] = v6;
    std::vector<double> v18 = v21;
    double v23 = v5;
    v18[5] = v5;
    v21[4] = v0;
    v18[3] = v11;
    v21[1] = v23;
    const double v37 = v18[3];
    const std::vector<double> v34 { v6 };
    double v24 = v37;
    const double v33 = v34[0];
    v18[3] = v37;
    v24 = v37;
    double v51 = v33;
    v21[4] = v51;
    return v24;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const double v10 = f107(v1);
    double v13 = v10;
    const double v17 = v1 * v1;
    v13 = v17;
    return v13;
  }
  int main() {
    std::vector<s2> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } }, 3.0 }, { { { { 4.0 }, { 5.0 } }, { { 6.0 } }, 7.0 } }, { { { 8.0 }, { 9.0 } }, { { 10.0 } }, 11.0 }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } }, 15.0 }, { { { 16.0 }, { 17.0 } }, { { 18.0 } }, 19.0 } }, { { { { { 20.0 }, { 21.0 } }, { { 22.0 } }, 23.0 }, { { { 24.0 }, { 25.0 } }, { { 26.0 } }, 27.0 } } } } });
    double v1(28.0);
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
