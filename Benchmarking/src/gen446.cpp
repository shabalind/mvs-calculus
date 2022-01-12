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
    std::vector<s0> p2;
    s1(s0 v0, s0 v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f65(const double &v0) {
    double v1 = v0;
    double v8 = v0;
    double v7 = v1;
    double v3 = v7;
    v7 = v0;
    double v5 = v0;
    double v6 = v3;
    double v16 = v7;
    const std::vector<double> v17 { v16, v0, v16, v7, v16, v7, v6 };
    v16 = v8;
    const double v21 = v17[3];
    v1 = v21;
    v1 = v3;
    const double v14 = v17[4];
    std::vector<double> v9 = v17;
    const std::vector<std::vector<double>> v13 { v17, v17, v9, v9 };
    const std::vector<double> v30 = v13[1];
    v9[6] = v6;
    std::vector<std::vector<double>> v25 = v13;
    v25 = v13;
    const std::vector<double> v23 = v25[2];
    std::vector<std::vector<double>> v31 = v13;
    std::vector<std::vector<double>> v18 = v31;
    const std::vector<double> v24 = v18[0];
    v9[2] = v5;
    v31[1] = v23;
    v25[0] = v9;
    v31[1] = v30;
    const double v19 = v23[2];
    const std::vector<double> v47 = v18[1];
    v25[1] = v47;
    v31[0] = v30;
    std::vector<double> v55 = v24;
    v25[1] = v55;
    const double v58 = v14 / v19;
    return v58;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const std::vector<s2> &v1, const double &v2) {
    const double v13 = f65(v2);
    double v37 = v13;
    double v42 = v37;
    return v42;
  }
  int main() {
    s1 v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { 9.0 } }, { { 10.0 }, { 11.0 } } } } });
    std::vector<s2> v1({ { { { { 12.0 } }, { { 13.0 }, { 14.0 } } }, { { { { 15.0 } }, { { 16.0 }, { 17.0 } } }, { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 } } } } } } });
    double v2(27.0);
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
