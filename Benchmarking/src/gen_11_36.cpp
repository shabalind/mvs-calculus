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
    std::vector<s0> p1;
    std::vector<std::vector<s0>> p2;
    std::vector<std::vector<s0>> p3;
    s1(s0 v0, std::vector<s0> v1, std::vector<std::vector<s0>> v2, std::vector<std::vector<s0>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s3 {
    s0 p0;
    s0 p1;
    s3(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s1 p0;
    std::vector<s3> p1;
    s5(s1 v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  double f94(const double &v0) {
    double v4 = v0;
    double v1 = v0;
    double v6 = v1;
    double v7 = v1;
    v7 = v1;
    double v9 = v7;
    double v3 = v1;
    double v2 = v9;
    double v5 = v4;
    const std::vector<double> v13 { v9, v0, v4, v6 };
    const std::vector<std::vector<double>> v17 { v13, v13, v13 };
    v3 = v0;
    const std::vector<double> v10 = v17[0];
    const std::vector<double> v14 = v17[0];
    std::vector<double> v18 = v14;
    std::vector<double> v19 = v10;
    const double v35 = v18[2];
    v19[0] = v3;
    const double v30 = v14[0];
    const std::vector<double> v41 { v35, v2, v5 };
    v18[3] = v30;
    const double v32 = v19[2];
    v7 = v32;
    const double v92 = v41[1];
    v18[3] = v0;
    return v92;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s5 &v1, const double &v2) {
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<double> v20 = v4[0];
    const double v61 = v20[0];
    const double v41 = v61 / v2;
    const double v76 = f94(v61);
    const double v39 = v76 - v41;
    return v39;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { 1.0, 2.0, 3.0 } });
    s5 v1({ { { { { 4.0 } }, { 5.0, 6.0, 7.0 } }, { { { { 8.0 } }, { 9.0, 10.0, 11.0 } }, { { { 12.0 } }, { 13.0, 14.0, 15.0 } } }, { { { { { 16.0 } }, { 17.0, 18.0, 19.0 } } }, { { { { 20.0 } }, { 21.0, 22.0, 23.0 } } } }, { { { { { 24.0 } }, { 25.0, 26.0, 27.0 } } }, { { { { 28.0 } }, { 29.0, 30.0, 31.0 } } }, { { { { 32.0 } }, { 33.0, 34.0, 35.0 } } } } }, { { { { { 36.0 } }, { 37.0, 38.0, 39.0 } }, { { { 40.0 } }, { 41.0, 42.0, 43.0 } } }, { { { { 44.0 } }, { 45.0, 46.0, 47.0 } }, { { { 48.0 } }, { 49.0, 50.0, 51.0 } } } } });
    double v2(52.0);
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
