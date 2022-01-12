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
  struct s3 {
    s1 p0;
    std::vector<s0> p1;
    s3(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f63(const double &v0) {
    double v5 = v0;
    double v7 = v0;
    double v4 = v5;
    double v1 = v0;
    double v2 = v4;
    double v8 = v2;
    double v3 = v1;
    double v15 = v7;
    v5 = v8;
    double v11 = v15;
    double v16 = v1;
    const std::vector<double> v33 { v7, v3, v11, v16, v1, v5 };
    v11 = v0;
    std::vector<double> v14 = v33;
    double v21 = v3;
    v11 = v16;
    v14 = v33;
    v14[4] = v21;
    const double v27 = v14[2];
    return v27;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const double v2 = v1 + v1;
    const double v7 = f63(v2);
    double v14 = v7;
    double v15 = v7;
    const std::vector<double> v28 { v15, v1, v15, v7, v14, v2, v15 };
    std::vector<double> v18 = v28;
    double v56 = v14;
    v15 = v14;
    v18[2] = v2;
    const double v60 = v18[1];
    v56 = v15;
    const double v113 = v56 - v60;
    return v113;
  }
  int main() {
    std::vector<s3> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { 3.0 } }, { { 4.0 }, { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 }, { 8.0 } } } } }, { { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } }, { { { { { 18.0 } }, { { 19.0 }, { 20.0 } } }, { { { 21.0 } }, { { 22.0 }, { 23.0 } } } }, { { { { 24.0 } }, { { 25.0 }, { 26.0 } } } } } });
    double v1(27.0);
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
