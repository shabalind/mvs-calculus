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
    std::vector<double> p2;
    s1(s0 v0, s0 v1, std::vector<double> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s1>> p0;
    std::vector<s2> p1;
    s3(std::vector<std::vector<s1>> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  double f28(const double &v0) {
    double v7 = v0;
    double v1 = v7;
    double v4 = v7;
    double v6 = v4;
    double v8 = v0;
    double v5 = v1;
    v7 = v1;
    double v20 = v5;
    double v12 = v6;
    double v9 = v20;
    double v11 = v20;
    double v21 = v0;
    v6 = v21;
    v21 = v11;
    const std::vector<double> v29 { v8 };
    const std::vector<double> v18 { v4, v1 };
    const double v26 = v29[0];
    std::vector<double> v19 = v18;
    const double v28 = v19[0];
    std::vector<double> v24 = v29;
    const double v25 = v24[0];
    double v27 = v5;
    const double v34 = v29[0];
    v19[1] = v26;
    const std::vector<double> v44 { v27, v11, v25, v9, v26, v0 };
    std::vector<double> v46 = v44;
    v21 = v28;
    const double v30 = v46[0];
    const double v77 = v18[0];
    const double v59 = v44[4];
    v46[4] = v27;
    std::vector<double> v150 = v44;
    const double v32 = v19[1];
    v19[1] = v77;
    v19[1] = v12;
    v150[2] = v34;
    v150[4] = v32;
    const double v57 = v150[1];
    v46[2] = v8;
    v9 = v59;
    v6 = v30;
    v150 = v46;
    return v57;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const double v2 = f28(v1);
    const double v8 = f28(v1);
    const double v16 = f28(v1);
    const double v19 = f28(v2);
    const double v28 = f28(v16);
    const std::vector<double> v27 { v19, v2, v8, v19, v28 };
    const double v26 = v27[4];
    const double v72 = f28(v26);
    return v72;
  }
  int main() {
    std::vector<s3> v0({ { { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { 8.0, 9.0, 10.0 } } }, { { { { { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 }, { 18.0 } } }, { 19.0, 20.0, 21.0 } } } }, { { { { { { 22.0 } }, { { 23.0 }, { 24.0 }, { 25.0 } } }, { { { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { 30.0, 31.0, 32.0 } }, { { { 33.0 } }, { { 34.0 }, { 35.0 }, { 36.0 } } } }, { { { { { 37.0 } }, { { 38.0 }, { 39.0 }, { 40.0 } } }, { { { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } }, { 45.0, 46.0, 47.0 } }, { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } }, { { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } }, { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { 60.0, 61.0, 62.0 } }, { { { 63.0 } }, { { 64.0 }, { 65.0 }, { 66.0 } } } } } } });
    double v1(67.0);
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
