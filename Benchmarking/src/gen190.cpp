  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    s2 p1;
    s3(s2 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s3> p0;
    s4(std::vector<s3> v0): p0(v0) { }
  };
  double f52(const double &v0) {
    double v1 = v0;
    double v6 = v0;
    double v5 = v1;
    const double v7 = v5 / v0;
    const std::vector<double> v3 { v1, v7, v6, v0, v1, v5, v0 };
    std::vector<double> v13 = v3;
    std::vector<double> v15 = v13;
    v13[1] = v6;
    v13[0] = v6;
    const double v10 = v15[0];
    std::vector<double> v18 = v3;
    std::vector<double> v23 = v15;
    v18[0] = v10;
    std::vector<double> v17 = v23;
    const double v24 = v23[0];
    const std::vector<std::vector<double>> v16 { v23, v18, v15, v13 };
    v13[5] = v10;
    std::vector<double> v14 = v13;
    const std::vector<double> v45 = v16[1];
    const double v20 = v15[6];
    const double v33 = v14[0];
    const std::vector<double> v28 = v16[3];
    v18[4] = v33;
    std::vector<double> v40 = v28;
    const std::vector<double> v37 = v16[0];
    v14[4] = v24;
    std::vector<double> v70 = v28;
    const std::vector<std::vector<double>> v39 { v70, v13, v40, v70, v45, v37, v17 };
    const std::vector<double> v32 = v39[3];
    const double v31 = v32[0];
    const double v103 = v40[5];
    v40[0] = v20;
    const double v77 = v3[2];
    v15[5] = v77;
    v15[5] = v103;
    return v31;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<s4> &v1, const std::vector<s2> &v2, const double &v3) {
    double v5 = v3;
    double v10 = v5;
    const double v4 = f52(v10);
    return v4;
  }
  int main() {
    s2 v0({ { { { 0.0 } }, { { 1.0 } } }, { { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } }, { { { 6.0 } }, { { 7.0 } } } } });
    std::vector<s4> v1({ { { { { { { { 8.0 } }, { { 9.0 } } }, { { { { 10.0 } }, { { 11.0 } } }, { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } } } }, { { { { 16.0 } }, { { 17.0 } } }, { { { { 18.0 } }, { { 19.0 } } }, { { { 20.0 } }, { { 21.0 } } }, { { { 22.0 } }, { { 23.0 } } } } } }, { { { { { 24.0 } }, { { 25.0 } } }, { { { { 26.0 } }, { { 27.0 } } }, { { { 28.0 } }, { { 29.0 } } }, { { { 30.0 } }, { { 31.0 } } } } }, { { { { 32.0 } }, { { 33.0 } } }, { { { { 34.0 } }, { { 35.0 } } }, { { { 36.0 } }, { { 37.0 } } }, { { { 38.0 } }, { { 39.0 } } } } } } } } });
    std::vector<s2> v2({ { { { { 40.0 } }, { { 41.0 } } }, { { { { 42.0 } }, { { 43.0 } } }, { { { 44.0 } }, { { 45.0 } } }, { { { 46.0 } }, { { 47.0 } } } } } });
    double v3(48.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
