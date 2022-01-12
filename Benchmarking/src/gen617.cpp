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
    std::vector<double> p1;
    s3(s1 v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s3> p0;
    s1 p1;
    s7(std::vector<s3> v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f86(const double &v0) {
    double v7 = v0;
    v7 = v0;
    double v1 = v7;
    double v6 = v0;
    double v9 = v7;
    double v4 = v1;
    double v14 = v6;
    v9 = v6;
    const std::vector<double> v21 { v0, v0, v6, v4, v9, v0 };
    std::vector<double> v25 = v21;
    double v40 = v0;
    const double v23 = v21[2];
    v25[3] = v14;
    double v20 = v23;
    const double v57 = v25[5];
    std::vector<double> v32 = v21;
    v25[5] = v7;
    v25[2] = v20;
    const double v64 = v32[2];
    const double v61 = v21[2];
    v1 = v40;
    v25[5] = v64;
    v25[3] = v61;
    return v57;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const double &v1) {
    const double v17 = f86(v1);
    const std::vector<double> v10 { v1, v1 };
    double v13 = v17;
    double v25 = v13;
    std::vector<double> v48 = v10;
    const std::vector<std::vector<double>> v39 { v10, v10, v10, v48, v48, v48 };
    const std::vector<double> v61 = v39[1];
    const double v147 = v10[0];
    const double v73 = f86(v147);
    v48[1] = v25;
    const double v115 = v61[0];
    v48[0] = v73;
    return v115;
  }
  int main() {
    s7 v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { 10.0 } } }, { { { { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 }, { 20.0 } } } } });
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
