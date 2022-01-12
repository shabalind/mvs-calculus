  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    std::vector<s0> p2;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1, std::vector<s0> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s3 {
    s1 p0;
    s1 p1;
    s3(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  double f10(const double &v0) {
    double v2 = v0;
    double v4 = v2;
    double v1 = v4;
    double v3 = v0;
    const double v6 = v4 / v2;
    v1 = v2;
    double v7 = v2;
    double v5 = v3;
    double v9 = v6;
    const double v17 = v9 / v7;
    double v11 = v2;
    double v10 = v5;
    double v14 = v7;
    const double v15 = v14 * v17;
    const std::vector<double> v24 { v10 };
    v10 = v15;
    const double v26 = v24[0];
    double v62 = v7;
    std::vector<double> v25 = v24;
    v25[0] = v3;
    const double v32 = v24[0];
    std::vector<double> v28 = v25;
    v25[0] = v32;
    v25[0] = v1;
    v25[0] = v11;
    v25[0] = v26;
    v25[0] = v1;
    v28[0] = v62;
    v25[0] = v11;
    const double v54 = v28[0];
    return v54;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    const double v5 = f10(v1);
    const double v8 = f10(v5);
    const s1 v4 = v0.p0;
    const std::vector<std::vector<s0>> v7 = v4.p0;
    const std::vector<s0> v11 = v7[1];
    const std::vector<s0> v23 = v4.p1;
    std::vector<std::vector<s0>> v16 = v7;
    const std::vector<s0> v22 = v16[2];
    const double v27 = f10(v8);
    std::vector<std::vector<s0>> v28 = v7;
    const s0 v61 = v22[0];
    const std::vector<std::vector<double>> v37 = v61.p0;
    const std::vector<double> v72 = v37[0];
    v16[1] = v23;
    std::vector<double> v35 = v72;
    const double v42 = v35[0];
    v35[0] = v27;
    const std::vector<s0> v68 = v28[0];
    v16[0] = v68;
    v16[2] = v11;
    return v42;
  }
  int main() {
    s3 v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } }, { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } }, { { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } } } }, { { { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } } }, { { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } } }, { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } } } }, { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } }, { { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } }, { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } }, { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } } } } });
    double v1(56.0);
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
