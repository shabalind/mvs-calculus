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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s0 p0;
    s1 p1;
    s3(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s3 f43(const s3 &v0) {
    const std::vector<s3> v5 { v0 };
    const s3 v3 = v5[0];
    const s3 v12 = v5[0];
    std::vector<s3> v8 = v5;
    v8[0] = v12;
    v8[0] = v0;
    v8[0] = v3;
    std::vector<s3> v25 = v8;
    std::vector<s3> v188 = v25;
    const s3 v145 = v188[0];
    return v145;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s3>> &v0, const double &v1) {
    const std::vector<s3> v4 = v0[0];
    const s3 v5 = v4[0];
    const std::vector<double> v12 { v1 };
    const s3 v6 = f43(v5);
    const double v8 = v12[0];
    const s0 v14 = v6.p0;
    std::vector<double> v15 = v12;
    const std::vector<std::vector<double>> v9 = v14.p1;
    const std::vector<double> v21 = v9[2];
    const double v23 = v21[0];
    v15[0] = v23;
    const double v29 = v8 + v8;
    v15 = v21;
    std::vector<double> v58 = v21;
    const double v43 = v58[0];
    v58[0] = v8;
    v58[0] = v29;
    const double v105 = v15[0];
    const double v118 = v23 + v105;
    v15[0] = v29;
    const double v185 = v118 / v43;
    return v185;
  }
  int main() {
    std::vector<std::vector<s3>> v0({ { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } } } }, { { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } } } } });
    double v1(24.0);
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
