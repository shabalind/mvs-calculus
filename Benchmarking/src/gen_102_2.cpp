  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f76(const double &v0) {
    const double v5 = v0 - v0;
    double v4 = v5;
    const std::vector<double> v7 { v5, v0, v4, v0, v0 };
    const double v8 = v7[4];
    const std::vector<double> v2 { v5, v4, v8, v5, v5, v5, v5 };
    const double v15 = v2[2];
    double v26 = v15;
    return v26;
  }
  double f45(const double &v0) {
    double v2 = v0;
    const double v4 = f76(v2);
    const double v8 = f76(v0);
    const double v7 = f76(v8);
    const std::vector<double> v10 { v4, v2 };
    const double v13 = v10[0];
    const double v24 = f76(v13);
    const double v14 = f76(v24);
    const double v30 = v10[1];
    std::vector<double> v22 = v10;
    const double v50 = f76(v13);
    const double v40 = f76(v24);
    v22[1] = v7;
    v22[1] = v8;
    std::vector<double> v42 = v10;
    const double v31 = f76(v40);
    const double v33 = v42[1];
    v42[0] = v50;
    const double v71 = v42[0];
    std::vector<double> v55 = v22;
    v22[0] = v71;
    v42[1] = v14;
    const double v60 = v55[1];
    v55[1] = v33;
    v55[1] = v31;
    v42[0] = v30;
    v42[0] = v50;
    return v60;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<std::vector<s0>> &v1, const double &v2) {
    const double v4 = f45(v2);
    return v4;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } } });
    std::vector<std::vector<s0>> v1({ { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } });
    double v2(36.0);
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
