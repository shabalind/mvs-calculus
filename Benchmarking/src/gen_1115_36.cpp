  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s1 p0;
    s0 p1;
    s4(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  double f43(const double &v0) {
    double v3 = v0;
    double v8 = v0;
    double v2 = v8;
    double v14 = v0;
    double v6 = v3;
    double v17 = v3;
    double v1 = v17;
    double v15 = v1;
    double v12 = v17;
    const std::vector<double> v25 { v2, v8 };
    v3 = v15;
    double v20 = v12;
    double v24 = v14;
    std::vector<double> v23 = v25;
    std::vector<double> v18 = v23;
    std::vector<double> v22 = v18;
    double v27 = v6;
    std::vector<double> v37 = v22;
    v23[0] = v20;
    std::vector<double> v33 = v37;
    v33[0] = v24;
    v37[1] = v27;
    const double v49 = v33[1];
    double v39 = v49;
    return v39;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const double &v1) {
    double v7 = v1;
    v7 = v1;
    const double v36 = f43(v7);
    return v36;
  }
  int main() {
    std::vector<s4> v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 } }, { { 3.0 } }, { { 4.0 }, { 5.0 } }, { { 6.0 } } } }, { { { { 7.0 } }, { { 8.0 }, { 9.0 } }, { { 10.0 } }, { { 11.0 }, { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 }, { 16.0 } }, { { 17.0 } }, { { 18.0 }, { 19.0 } }, { { 20.0 } } } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } }, { { 24.0 } }, { { 25.0 }, { 26.0 } }, { { 27.0 } } } } });
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
