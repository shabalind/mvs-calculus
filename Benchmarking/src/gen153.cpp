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
    s1 p0;
    s0 p1;
    s2(s1 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s3(s1 v0): p0(v0) { }
  };
  struct s4 {
    std::vector<s2> p0;
    s2 p1;
    s4(std::vector<s2> v0, s2 v1): p0(v0), p1(v1) { }
  };
  double f28(const double &v0) {
    double v1 = v0;
    double v2 = v1;
    v2 = v0;
    double v5 = v1;
    double v7 = v1;
    double v6 = v7;
    v6 = v0;
    double v4 = v2;
    double v10 = v5;
    double v14 = v4;
    double v3 = v14;
    double v8 = v6;
    const double v11 = v5 / v6;
    double v15 = v4;
    double v24 = v11;
    double v13 = v0;
    double v21 = v5;
    double v31 = v0;
    const std::vector<double> v35 { v3, v21, v8, v15 };
    const double v27 = v35[0];
    double v62 = v3;
    v24 = v13;
    const double v29 = v35[3];
    const double v46 = v35[1];
    const double v30 = v31 + v62;
    std::vector<double> v52 = v35;
    std::vector<double> v33 = v52;
    v52[2] = v21;
    std::vector<double> v75 = v33;
    v33[2] = v15;
    v33[1] = v29;
    v75[2] = v31;
    const double v42 = v30 / v27;
    std::vector<double> v47 = v35;
    v52[1] = v29;
    std::vector<double> v28 = v33;
    const std::vector<std::vector<double>> v71 { v28, v35, v33, v75, v47, v52, v75 };
    v47 = v52;
    const std::vector<double> v109 = v71[1];
    const double v32 = v109[0];
    v33[3] = v10;
    v52[3] = v24;
    v33[0] = v46;
    v24 = v42;
    return v32;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const s3 &v1, const s3 &v2, const double &v3) {
    const double v5 = f28(v3);
    const double v7 = f28(v5);
    const double v28 = v7 - v7;
    return v28;
  }
  int main() {
    s4 v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } } }, { { { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } }, { { { 25.0 }, { 26.0 }, { 27.0 } }, { { 28.0 }, { 29.0 } } } } });
    s3 v1({ { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 } } }, { { { 35.0 }, { 36.0 }, { 37.0 } }, { { 38.0 }, { 39.0 } } } } });
    s3 v2({ { { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 }, { 47.0 } }, { { 48.0 }, { 49.0 } } } } });
    double v3(50.0);
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
