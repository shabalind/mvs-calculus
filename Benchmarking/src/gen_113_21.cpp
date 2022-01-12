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
  struct s2 {
    s0 p0;
    s0 p1;
    s2(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s1> p0;
    std::vector<s2> p1;
    s4(std::vector<s1> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  double f18(const double &v0) {
    double v3 = v0;
    double v6 = v0;
    double v4 = v6;
    double v7 = v0;
    double v5 = v7;
    double v8 = v0;
    double v1 = v3;
    const std::vector<double> v22 { v4 };
    const double v9 = v22[0];
    const double v12 = v22[0];
    const double v13 = v22[0];
    double v28 = v8;
    double v29 = v1;
    v7 = v0;
    const double v20 = v22[0];
    const std::vector<double> v56 { v20, v9, v6, v9, v8 };
    std::vector<double> v64 = v56;
    v29 = v5;
    const double v48 = v22[0];
    std::vector<double> v50 = v64;
    const double v74 = v22[0];
    v50[2] = v13;
    std::vector<double> v84 = v50;
    v84 = v56;
    v84[0] = v48;
    v84[0] = v12;
    v28 = v74;
    v84[0] = v28;
    v50[3] = v29;
    std::vector<double> v165 = v84;
    const double v136 = v165[2];
    return v136;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    double v16 = v1;
    const double v14 = f18(v16);
    const double v94 = f18(v14);
    return v94;
  }
  int main() {
    std::vector<s4> v0({ { { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } } }, { { { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } } } } });
    double v1(8.0);
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
