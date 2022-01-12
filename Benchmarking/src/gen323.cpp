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
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s0 p1;
    std::vector<s0> p2;
    s2(s0 v0, s0 v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s2 p1;
    std::vector<s0> p2;
    s3(std::vector<s1> v0, s2 v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  double f52(const double &v0) {
    double v6 = v0;
    double v7 = v0;
    const std::vector<double> v2 { v7 };
    v7 = v6;
    const double v5 = v0 - v7;
    std::vector<double> v3 = v2;
    std::vector<double> v4 = v2;
    v4[0] = v0;
    v6 = v7;
    std::vector<double> v11 = v4;
    double v1 = v5;
    double v8 = v5;
    double v9 = v0;
    std::vector<double> v13 = v4;
    v13[0] = v8;
    std::vector<double> v16 = v13;
    const std::vector<std::vector<double>> v23 { v13, v2, v13, v11, v3 };
    const std::vector<double> v17 = v23[2];
    std::vector<std::vector<double>> v18 = v23;
    const double v19 = v16[0];
    std::vector<double> v14 = v11;
    v11[0] = v1;
    std::vector<double> v15 = v14;
    const std::vector<double> v27 = v18[2];
    v18[1] = v27;
    v11[0] = v6;
    const double v35 = v15[0];
    std::vector<std::vector<double>> v37 = v18;
    const std::vector<double> v78 = v37[4];
    const double v83 = v35 / v9;
    v13[0] = v19;
    v11 = v78;
    const double v103 = v17[0];
    v13[0] = v83;
    return v103;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const s0 &v1, const double &v2) {
    double v21 = v2;
    const double v40 = f52(v21);
    v21 = v2;
    return v40;
  }
  int main() {
    std::vector<s3> v0({ { { { { { { 0.0 } }, { { 1.0 } } }, { { { { { 2.0 } }, { { 3.0 } } } } } }, { { { { 4.0 } }, { { 5.0 } } }, { { { { { 6.0 } }, { { 7.0 } } } } } }, { { { { 8.0 } }, { { 9.0 } } }, { { { { { 10.0 } }, { { 11.0 } } } } } } }, { { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } }, { { { { 16.0 } }, { { 17.0 } } }, { { { 18.0 } }, { { 19.0 } } } } }, { { { { 20.0 } }, { { 21.0 } } }, { { { 22.0 } }, { { 23.0 } } } } }, { { { { { { 24.0 } }, { { 25.0 } } }, { { { { { 26.0 } }, { { 27.0 } } } } } }, { { { { 28.0 } }, { { 29.0 } } }, { { { { { 30.0 } }, { { 31.0 } } } } } }, { { { { 32.0 } }, { { 33.0 } } }, { { { { { 34.0 } }, { { 35.0 } } } } } } }, { { { { 36.0 } }, { { 37.0 } } }, { { { 38.0 } }, { { 39.0 } } }, { { { { 40.0 } }, { { 41.0 } } }, { { { 42.0 } }, { { 43.0 } } } } }, { { { { 44.0 } }, { { 45.0 } } }, { { { 46.0 } }, { { 47.0 } } } } } });
    s0 v1({ { { 48.0 } }, { { 49.0 } } });
    double v2(50.0);
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
